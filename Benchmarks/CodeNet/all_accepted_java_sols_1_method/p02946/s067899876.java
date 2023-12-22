import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt() - 1;
        int X = sc.nextInt();
        int min = X - K;
        int max = X + K;
        for (int i = min; i <= max; i++) {
        	System.out.print(i + " ");
        }
    }
}