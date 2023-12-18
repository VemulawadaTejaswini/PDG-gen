import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        int ans = 0;

        for (int i = 0; i < 1000; i++) {

            ans += t;
            n -= x;
            if (n <= 0) {
                break;
            }
        }

        System.out.println(ans);   
      }
}