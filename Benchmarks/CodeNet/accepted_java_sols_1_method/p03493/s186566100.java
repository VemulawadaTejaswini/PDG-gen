import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int ans = 0;
		for(char x: s.toCharArray()) {
			if(x == '1') {
				ans++;
			}
		}
		
		System.out.println(ans);
	}

}
