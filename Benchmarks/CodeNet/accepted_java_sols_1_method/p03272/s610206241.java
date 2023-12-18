import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        boolean check = false;
        while(check) {
        	if(1 <= n && n <= 100 && 1 <= i && i <= n) {
                check = true;
            }
            n = sc.nextInt();
            i = sc.nextInt();
        }
        
        
        System.out.println(n + 1 - i);
    }
}
