import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ch = 0;
		for(int i = 1;i < 10000;i++) {
			if(c == a*i % b) {
				System.out.println("YES");
				ch =1;
				break;
			}
		}
		if(ch == 0) {
			System.out.println("NO");
		}
	}

}
