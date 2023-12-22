
import java.io.*;

import java.lang.annotation.Native;
import java.math.BigInteger;
import java.util.*;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static final int mod = 1000000007;
    static final int mod1 = 1073741824;

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static boolean prime[] = new boolean[1000001];
    public static void merge(long arr[][], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        long L[][] = new long[n1][2];
        long R[][] = new long[n2][2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
        {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];


        }

        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i][0] <= R[j][0]) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];

                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];

            j++;
            k++;
        }
    }

    public static long[][] sort2elementarray(long arr[][], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort2elementarray(arr, l, m);
            sort2elementarray(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }


    static int f=1;
    static int vertices=0;
    static int edges=0;
    public static void dfs(ArrayList<Integer>[]li,int v,HashMap<Integer,Integer>hm)
    {
        hm.put(v,1);

        //System.out.print(v+" ");
        //System.out.println(a[v]+" "+cost);


            vertices++;
            edges+=li[v].size();
            for (int j = 0; j < li[v].size(); j++)
            {

                if (hm.get(li[v].get(j)) == null)
                {

                    dfs(li, li[v].get(j), hm);

                }
            }
        }




    public static void dfsutil(ArrayList<Integer>[]li,int n,int v)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int c=0;

        for(int j=1;j<=n;j++)
        {

            if(hm.get(j)==null)
            {
                vertices=0;
                edges=0;
                dfs(li,j,hm);
                if(edges!=vertices*(vertices-1)) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
            System.out.println("YES");


    }
    public static void bipartite(ArrayList<Integer>[]li,int n) {
        int f = 1;
        int col[] = new int[n + 1];
        int fl = 1;
        Arrays.fill(col, -1);
        for (int i = 1; i <= n; i++) {
            if (col[i] == -1) {
                col[i] = 1;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int x = q.peek();
                    q.remove();
                    for (int j = 0; j < li[x].size(); j++) {
                        if (col[li[x].get(j)] == -1) {
                            col[li[x].get(j)] = 1 - col[x];
                            q.add(li[x].get(j));
                        } else if (col[li[x].get(j)] == col[x]) {
                            f = 0;
                            break;
                        }

                    }

                }
                if (f == 0) {
                    fl = 0;
                    break;
                }


            }

        }
        /*if(fl==0)
          //  System.out.println(-1);
        //else
        {*/

        long l1 = 0;
        long l2 = 0;
        for (int j = 1; j <= n; j++) {
            if (col[j] == 1) {
                l1++;
                //sb.append(j+" ");
            } else {
                l2++;
                //sb1.append(j+" ");
            }
        }
        long ans=(l1*l2)-(n-1);
        System.out.println(ans);
    //}

    }



    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        String ac="AC";
        long a=0;
        String tle="TLE";
        long t=0;
        String wa="WA";
        long w=0;
        String re="RE";
        long r=0;
        for(int j=0;j<n;j++)
        {
            String s=sc.nextLine();
            if(s.compareTo(ac)==0)
                a++;
            else if(s.compareTo(tle)==0)
                t++;
            else if(s.compareTo(wa)==0)
                w++;
            else
                r++;
        }
        System.out.println(ac+ " "+"x"+" "+a);
        System.out.println(wa+ " "+"x"+" "+w);
        System.out.println(tle+ " "+"x"+" "+t);
        System.out.println(re+ " "+"x"+" "+r);



    }
}


















