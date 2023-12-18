import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m, f, r;
		char g;
		while(true){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

			if((m == -1) && (f == -1) && (r == -1))
				break;
			else if((m == -1) || (f == -1))
				g = 'F';
			else if((m + f) < 30)
				g = 'F';
			else if((m + f) < 50){
				if(r < 50)
					g = 'D';
				else
					g = 'C';
			}else if((m + f) <65)
				g = 'C';
			else if((m + f) < 80)
				g = 'B';
			else
				g = 'A';
			System.out.println(g);
		}
	}
}