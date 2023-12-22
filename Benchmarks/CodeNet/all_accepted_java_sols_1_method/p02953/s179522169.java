import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = 0;
        while(n-- > 0) {
        	int num = sc.nextInt();
        	if(num > prev) {
        		prev = num - 1;
        	} else if(num < prev) {
        		System.out.println("No");
        		return;
        	}
        }
        System.out.println("Yes");
    }
}
