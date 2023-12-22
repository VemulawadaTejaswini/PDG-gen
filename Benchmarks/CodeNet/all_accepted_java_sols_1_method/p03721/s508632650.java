import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        long k=Long.parseLong(sc.next());
        HashMap<Integer, ArrayList<Integer>> nums=new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> sorted=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(sc.next());
            if(!nums.containsKey(a)){
                nums.put(a, new ArrayList<Integer>());
            }
            nums.get(a).add(Integer.parseInt(sc.next()));
            sorted.add(a);
        }
        sc.close();
        Collections.sort(sorted);
        long now=0;
        int val=sorted.get(0);
        int cnt=0;
        for(int a:sorted){
            if(a==val){
                cnt++;
            }
            else{
                val=a;
                cnt=1;
            }
            if(now+nums.get(a).get(cnt-1)>=k){
                System.out.println(a);
                System.exit(0);
            }
            else{
                now+=nums.get(a).get(cnt-1);
            }
        }
    }
}