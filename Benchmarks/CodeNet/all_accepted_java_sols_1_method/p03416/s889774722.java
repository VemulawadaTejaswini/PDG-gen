import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = A;i <= B;++i) {
			String s = String.valueOf(i);
			boolean flag = true;
			for(int j = 0;j < s.length()/2;++j) {
				if(s.charAt(j) != s.charAt(s.length()-1-j)) {
					flag = false;
					break;
				}
			}
			if(flag)
				ans++;
		}
		System.out.println(ans);
	}
}
