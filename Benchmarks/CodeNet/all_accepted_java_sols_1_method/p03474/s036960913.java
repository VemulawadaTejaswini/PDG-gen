import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean ans = true;
		String s = sc.next();
		char c[] = s.toCharArray();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (i == a && c[i] != '-') {
				ans = false;

			}

			if (i != a) {
				if (c[i] != '0' && c[i] != '1' && c[i] != '2' && c[i] != '3'
						&& c[i] != '4' && c[i] != '5' && c[i] != '6'
						&& c[i] != '7' && c[i] != '8' && c[i] != '9') {
					ans = false;
				}
			}
		}
		if(s.length()!=a+b+1){
			ans=false;
		}

if(ans){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}
}