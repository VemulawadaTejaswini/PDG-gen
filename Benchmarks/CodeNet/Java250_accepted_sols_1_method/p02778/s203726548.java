import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		String a = "";
		String okikae = "";

		for(int i=0;i<s.length();i++) {

			okikae = s.substring(i,i+1);
			 okikae = "x";
			 a = a+ okikae;

		}

		System.out.println(a);

		scan.close();

	}

}
