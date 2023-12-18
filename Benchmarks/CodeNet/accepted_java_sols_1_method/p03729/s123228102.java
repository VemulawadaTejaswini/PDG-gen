import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] hajime = new char[3];
		char[] owari = new char[3];

		for(int i=0; i<3; i++) {
			String str = sc.next();
			hajime[i] = str.charAt(0);
			owari[i] = str.charAt(str.length() -1);
		}
		
		if(owari[0] == hajime[1] && owari[1] == hajime[2]) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}

	}
}