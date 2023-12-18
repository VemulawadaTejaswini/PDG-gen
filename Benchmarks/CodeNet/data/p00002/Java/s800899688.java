import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextLine())
			{
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println((int)(Math.log10(a+b))+1);
			}
		
		s.close();	
		}
}