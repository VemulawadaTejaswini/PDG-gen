

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        boolean visited[]=new boolean[n+1];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            if(!visited[a[i]]){
                visited[a[i]]=true;
                map.put(a[i],i);
            }
        }
        st=new StringTokenizer(br.readLine());
        int count[]=new int[n+1];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=n;i++){
            b[i]=Integer.parseInt(st.nextToken());
            count[b[i]]++;
            set.add(i);
        }
        ArrayList<PAir> pAirs=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(count[i]!=0){
                pAirs.add(new PAir(i,count[i]));
            }
        }
        Collections.sort(pAirs,Collections.reverseOrder());
        int ans[]=new int[n+1];
        for(PAir p:pAirs){
            int val=p.val;
            int c=p.count;
            boolean flag=true;
            int s=set.first();
//            System.out.println(set.toString());
//            System.out.println(map.toString());
            while(c!=0){
                if(a[s]==val){
                    if(map.higherKey(val)!=null){
                        int k=map.higherKey(val);
                        k=map.get(k);
                        if(set.contains(k)){
                            s=k;
                        }
                        else{
                            if(set.higher(k)!=null){
                                s=set.higher(k);
                            }
                            else{
                                flag=false;
                                break;
                            }
                        }
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                ans[s]=val;
                set.remove(s);
                c--;
                if(c==0){
                    break;
                }
                if(set.higher(s)!=null) {
                    s = set.higher(s);
                }
                else{
                    flag=false;
                    break;
                }
//                System.out.println(set.toString());
            }
            if(!flag){
                System.out.println("No");
                return;
            }
        }
        StringBuilder print=new StringBuilder();
        print.append("Yes").append("\n");
        for(int i=1;i<=n;i++){
            print.append(ans[i]).append(" ");
        }
        System.out.println(print.toString());
    }
}

class PAir implements Comparable<PAir>{
    int val,count;
    public PAir(int val,int count){
        this.val=val;
        this.count=count;
    }

    @Override
    public int compareTo(PAir o) {
        return this.count-o.count;
    }
}
