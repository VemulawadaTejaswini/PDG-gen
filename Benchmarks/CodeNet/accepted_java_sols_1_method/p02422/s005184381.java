import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.next());
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String row = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt() + 1;
			switch(row){
				case "print":
					System.out.println(str.substring(a, b));
					break;
				case "reverse":
					StringBuffer reverse = new StringBuffer(str.substring(a, b));
					str = str.replace(a, b, reverse.reverse().toString());
					break;
				case "replace":
					str = str.replace(a, b, sc.next());
					break;
				default:
			}
		}
	}
}

