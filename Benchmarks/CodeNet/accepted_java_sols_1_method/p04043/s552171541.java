
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, count1 = 0, count2 = 0;
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		c = sc.nextInt();
		if(c == 5)++count1;
		else if(c == 7)++count2;
		
		if(a == 5)++count1;
		else if(a == 7)++count2;
		if(b == 5)++count1;
		else if(b == 7)++count2;
		
		if(count1 == 2 && count2 == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
