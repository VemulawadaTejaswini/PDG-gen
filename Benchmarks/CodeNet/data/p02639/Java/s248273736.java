import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		int[] xs = new int[5];
		for (int i = 0; i<5; i++) {
		    xs[i] = sc.nextInt();
		    if (xs[i] == 0) {
		    ans = i+1;
		    } 
		}
		
		System.out.println(ans);
    }
}