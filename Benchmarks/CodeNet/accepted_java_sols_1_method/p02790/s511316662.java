import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuffer aString = new StringBuffer();
		StringBuffer bString = new StringBuffer();
		for(int i = 0; i < b; i++) {
			aString.append(a);
		}
		for(int i = 0; i < a; i++) {
			bString.append(b);
		}
		
		if(a < b) {
			System.out.println(aString);
		}else {
			System.out.println(bString);
		}
		sc.close();
	}
}