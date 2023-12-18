import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
		int arg = 0;
        String ans = "NG";

        for (int i = 0; i <= 1000; i++) {
		arg = K*i;
            if (A <= arg && arg <= B) {
                ans = "OK";
				break;
            } else if (B < arg) {
				break;
			}
        }

        System.out.println(ans);

        sc.close();
    }    
}
