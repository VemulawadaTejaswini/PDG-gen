import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[] n = stdIn.next().split("");
		String s = "";
		int cnt = 0;
		for(int i = 0; i < n.length; i++) {
			int a = Integer.parseInt(n[i]);
			cnt += a;
			s += n[i];
		}

		int b = Integer.parseInt(s);
		if(b%cnt==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}


}
