import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int d = sc.nextInt();
		int n = sc.nextInt();
		int ans = 1;
		for (int i = 0; i < d; i++) {
			ans *= 100;
		}
     int val = ans * n;
      if (n == 100) {
        val += ans;
      }
		System.out.println(val);
	}
}
