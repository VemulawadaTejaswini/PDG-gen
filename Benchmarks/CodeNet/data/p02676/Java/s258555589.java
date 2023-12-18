import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int I1= sc.nextInt();
		String S2 = sc.next();
		sc.close();

		if(S2.length() <= I1) {
			System.out.println(S2);
		}else{
			System.out.println(S2.substring(0, I1)+"...");
		}
	}
}

