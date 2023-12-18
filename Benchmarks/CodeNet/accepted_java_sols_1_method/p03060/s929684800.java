import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        ArrayList<Integer> V = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        
        for (int i=0; i<A; i++){
            V.add(sc.nextInt());
        }
        for (int i=0; i<A; i++){
            C.add(sc.nextInt());
        }
        
        int ans = 0;
        for (int i=0;i<A;i++){
            int t = V.get(i)-C.get(i);
            if(t>0){
                ans += t;
            }
        }
        
        System.out.println(ans);
        
    }
}