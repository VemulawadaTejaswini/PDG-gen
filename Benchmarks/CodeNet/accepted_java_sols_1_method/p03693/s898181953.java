import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String r =s.next();
		String g =s.next();
		String b =s.next();

		String an = r+g+b;
		int ans = Integer.parseInt(an);

		if(ans%4==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}





	}

}