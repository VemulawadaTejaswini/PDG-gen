import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
//------------------------------------------------------------

		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
      	sc.close();
		String[] strArray = new String[s.length()];

		for (int i = 0; i<=s.length()-1; i++) {
			strArray[i] = String.valueOf(s.charAt(i));
		}
		for (int i =0; 2*i <s.length() ; i++) {
			System.out.print(strArray[2*i]);
		}

//------------------------------------------------------------
	}
}
