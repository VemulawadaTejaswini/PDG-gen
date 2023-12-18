import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn = scan.nextLine();
		String strCheck = scan.nextLine();
		strIn += strIn;
		if(strIn.indexOf(strCheck) != -1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		scan.close();
	}
}