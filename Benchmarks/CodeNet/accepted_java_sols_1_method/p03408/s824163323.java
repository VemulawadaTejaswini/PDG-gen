import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static long MOD = 1000000007;

    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> point = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(point.containsKey(s)){
                int temp = point.get(s);
                point.remove(s);
                point.put(s,temp+1);
            }else{
                point.put(s,1);
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            String s = sc.next();
            if(point.containsKey(s)){
                int temp = point.get(s);
                point.remove(s);
                point.put(s,temp-1);
            }else{
                point.put(s,-1);
            }
        }
        int ans = Integer.MIN_VALUE;
        for(Integer p:point.values()){
            ans = Math.max(ans,p);
        }
        if(ans<0)ans=0;
        System.out.println(ans);




    }



}


