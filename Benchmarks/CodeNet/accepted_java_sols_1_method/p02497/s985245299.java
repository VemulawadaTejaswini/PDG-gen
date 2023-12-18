import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int m, f, r;
		int sum;
		
		while (true){
			m = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			
			if (m == -1 && f == -1 && r == -1){
				break;
			}
			
			if (m == -1 || f == -1){
				System.out.println('F');
				continue;
			}
			else if (m + f >= 80){
				System.out.println('A');
			}
			else if (m + f >= 65){
				System.out.println('B');
			}
			else if (m + f >= 50){
				System.out.println('C');
			}
			else if (m + f >= 30){
				System.out.println(r >= 50 ? 'C' : 'D');
			}
			else {
				System.out.println('F');
			}
		}
	}
}