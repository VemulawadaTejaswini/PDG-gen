import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		int ans = a;
		if(ans != b){
			if(ans == c)ans = b;
		}
		else{
			ans = c;
		}
		System.out.println(ans);
	}
}
