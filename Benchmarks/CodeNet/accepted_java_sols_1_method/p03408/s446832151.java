import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String,Integer> Blue = new HashMap<>();
        HashMap<String,Integer> Red = new HashMap<>();


        for(int i=0;i<N;i++){
            String cur = sc.next();
            if(Blue.containsKey(cur)){
                Blue.put(cur,Blue.get(cur)+1);
            }
            else Blue.put(cur,1);
        }
        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            String cur = sc.next();
            if(Red.containsKey(cur)){
                Red.put(cur,Red.get(cur)+1);
            }
            else Red.put(cur,1);
        }
        int ans = 0;
        for(String w:Blue.keySet()){
            int pos = Blue.get(w);
            int neg = Red.getOrDefault(w,0);
            ans = Math.max(ans,pos-neg);
        }


        
        System.out.println(ans);
    }
}
