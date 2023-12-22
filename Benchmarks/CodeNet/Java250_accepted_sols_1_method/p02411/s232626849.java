import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		while(true){
			int m = S.nextInt();
			int f = S.nextInt();
			int r = S.nextInt();
			
			if(m == -1 && f == -1 && r == -1)
				break;
			

			if((m + f < 30) || (m == -1 || f == -1))
				System.out.println("F");	
			else if(m + f >= 80)
				System.out.println("A");
			else if(m + f >= 65)
				System.out.println("B");
			else if(m + f >= 50 || r >= 50)
				System.out.println("C");
			else if(m + f >= 30)
				System.out.println("D");
		}
	}		
}