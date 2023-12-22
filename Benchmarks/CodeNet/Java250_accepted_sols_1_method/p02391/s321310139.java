
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		String str1 = a < b ? "a < b" : "";
		String str2 = a > b ? "a > b" : "";
		String str3 = a == b ? "a == b" : "";

		String str[] = {str1,str2,str3};

		for(String ss : str){
			if(!ss.equals("")){
				System.out.println(ss);
			}
		}

		scan.close();
	}
}