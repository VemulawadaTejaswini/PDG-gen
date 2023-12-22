import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) break;
			b -= a;
			int x, y, z;
			z = b/1000;
			b %= 1000;
			y = b/500;
			b %= 500;
			x = b/100;
			System.out.println(x + " " + y + " " + z);
		}
	}	
}