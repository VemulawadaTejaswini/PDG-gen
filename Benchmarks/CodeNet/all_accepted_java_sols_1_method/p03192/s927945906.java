import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		int cnt=0;
		for(int i=0;i<n.length();i++) {
			if(n.substring(i,i+1).equals("2")) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
