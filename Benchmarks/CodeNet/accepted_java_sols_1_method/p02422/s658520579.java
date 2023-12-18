import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.next();
			int order = sc.nextInt();

			while(order != 0) {
				String data = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();

				if(data.equals("replace")) {
					String st = sc.next();
					str = str.substring(0,a) + st + str.substring(b + 1);
				}else if(data.equals("reverse")) {
					String s = str.substring(a,b + 1);
					StringBuffer sb = new StringBuffer(s);
					s = sb.reverse().toString();
					str = str.substring(0,a) + s + str.substring(b + 1);
				}else if(data.equals("print")) {
					String s = str.substring(a,b + 1);
					System.out.println(s);
				}
				order--;
			}
		}
	}
}
