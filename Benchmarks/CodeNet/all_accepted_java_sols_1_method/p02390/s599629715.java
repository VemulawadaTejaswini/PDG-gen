import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int s;
		int m = 0;
		int h = 0;
		
		Scanner scan = new Scanner(System.in);
		s = scan.nextInt();
		
		for(; s >= 60 ;){
			s -= 60;
			m++;       }
			
		for(; m >= 60 ;){
			m -= 60;
			h++;       }
		
		System.out.println(h+":"+m+":"+s);
	}
}
