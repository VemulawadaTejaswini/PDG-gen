
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		scan.close();

		int x=0;
		int max=0;
		char sc[]=s.toCharArray();
		
		for(int i=0;i<n;i++) {
			if(sc[i]=='I') x++;
			else x--;
			
			if(x>max)max=x;
		}
		System.out.println(max);
	}
}