import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Set <Integer> st = new HashSet <Integer> ();
        for(int i = 1; i <= k; ++i){ 
            int d = sc.nextInt();
            for(int j = 1; j <= d; ++j){
                int x = sc.nextInt();
                st.add(x);
            }
        }
        System.out.println(n - st.size());
    }    
}