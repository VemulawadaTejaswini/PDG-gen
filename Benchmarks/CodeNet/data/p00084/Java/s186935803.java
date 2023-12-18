import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()){
				String str=sc.next();
				String str1=str;
				int d=str.length();
				if(str.charAt(d-1)==',') {
					str1=str.substring(0, d-1);
				}
				else if(str.charAt(d-1)=='.') {
					str1=str.substring(0, d-1);
				}
				
				if(str1.length()>=3 && str1.length()<=6) {
					System.out.printf("%s ",str1);
				}
			}
			System.out.printf("\n");

		}
	}
}
