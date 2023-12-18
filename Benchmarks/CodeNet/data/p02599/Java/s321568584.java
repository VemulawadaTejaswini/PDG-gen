import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st  = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Query[] queries = new Query[q];
        for (int i=0; i<q; i++) {
            st  = new StringTokenizer(br.readLine());
            queries[i] = new Query(Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1, i);
        }

        Arrays.sort(queries, new Comparator<Query>(){
            public int compare(Query a, Query b) {
                return a.r==b.r?a.l-b.l:a.r-b.r;
            }
        });
        int[] lastseen = new int[500001];
        Arrays.fill(lastseen, -1);

        int pos = 0;
        SegTree segTree = new SegTree(0,n-1);
        for (int i=0; i<q; i++) {
            int cur_r = queries[i].r;
            if (pos<cur_r) {
                for (int p=pos; p<=cur_r; p++) {
                    if (lastseen[arr[p]]!=-1) {
                        segTree.update(lastseen[arr[p]],0);
                    }
                    lastseen[arr[p]] = p;
                    segTree.update(lastseen[arr[p]],1);
                }
            }
            queries[i].ans= segTree.query(queries[i].l,cur_r);
            pos=cur_r;
        }

        Arrays.sort(queries, new Comparator<Query>(){
            public int compare(Query a, Query b) {
                return a.idx-b.idx;
            }
        });

        for (int i=0; i<q; i++) {
            out.println(queries[i].ans);
        }
        out.close();
    }

    static class SegTree{
        int leftmost,rightmost,sum;
        SegTree lchild, rchild;
        SegTree(int l, int r){
            leftmost=l;
            rightmost=r;
            if (leftmost==rightmost) {
                sum=0;
            }
            else {
                int mid = l+(r-l)/2;
                lchild = new SegTree(l, mid);
                rchild = new SegTree(mid+1, r);
            }

        }

        public void recalc() {
            if (leftmost!=rightmost) {
                sum = lchild.sum+rchild.sum;
            }
        }

        public void update(int idx, int val){
            if (leftmost==rightmost) {
                this.sum=val;
            }
            else if (idx<=lchild.rightmost) {
                lchild.update(idx, val);
            }
            else{
                rchild.update(idx, val);
            }
            recalc();
        }

        public int query(int l, int r){

            if (l>rightmost || r<leftmost) {
                return 0;
            }
            else if (l<=leftmost && r>=rightmost)
                return sum;
            else
                return lchild.query(l,r)+rchild.query(l,r);
        }
    }

    static class Query{
        int l,r,ans,idx;
        Query(int a, int b, int c){
            l=a;
            r=b;
            idx=c;
        }
    }




}