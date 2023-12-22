import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
			String s = scanner.next();
			long k = scanner.nextLong();
			int counter = 0;
			
			
			String[] array = new String[s.length()];
			for(int i = 0; i < s.length(); i++) 
			{
				array[i] = s.substring(i, i + 1);
			}
			
			for( int i = 0; i < s.length(); i++ ) 
			{
				if( array[i].equals("1") ) 
				{
					counter++;
				}
				else 
				{
					break;
				}
			}
			if( counter >= k) 
			{
				System.out.println(1);
			}
			else 
			{
				System.out.println(array[counter]);
			}
			
		    scanner.close(); }
		  }