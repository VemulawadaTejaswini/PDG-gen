
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int w = Integer.parseInt(scan.next());
		String str[] = s.split("");
		
		String st = "";
		
		for(int i=0;i < str.length;i =  i + w) {
			st = st + str[i];
		}
		System.out.println(st);
		scan.close();
	}
}