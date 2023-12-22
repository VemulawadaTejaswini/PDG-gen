import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		//100~999
		int ans=n;
		for(int i=n;i<1000;i++) {
			String s = String.valueOf(i);
			if(s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2)) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}