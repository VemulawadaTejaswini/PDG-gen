import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int jud = n/2+1;
        if(n%2 == 0){
            jud--;
        }
        String ans = "NO";
        
        if(k <= jud){
            ans = "YES";
        }
        System.out.println(ans);
    }
}
