import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		//int n = Integer.parseInt(sc.next());
		String[] s = sc.next().split("");
		
		int ans = 0;
		for(int i = 0 ; i < s.length ; i++) {
			ans += Integer.parseInt(s[i]);
		}
		
		if(ans % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}


