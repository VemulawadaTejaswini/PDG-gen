import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		int five=0;
		int seven=0;
		
		if(a==5) {
			five++;
		}else {
			seven++;
		}
		
		if(b==5) {
			five++;
		}else {
			seven++;
		}
		
		if(c==5) {
			five++;
		}else {
			seven++;
		}

		if(five==2 && seven==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}		
	}
}
