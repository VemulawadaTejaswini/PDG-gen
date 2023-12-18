
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		while(scan.hasNext())
		{
			
			String s,s1 ;
			s=scan.next();
			char arr[]=s.toCharArray();
			int c1=((arr[0]-48)*10)+(arr[1]-48);
			int c2=((arr[2]-48)*10)+(arr[3]-48);
			if((c1>0 && c1<=12 && c2>=0) && (c1>=0 && c2>0 && c2<=12))
				System.out.println("AMBIGUOUS");
			else if(c1>0 && c1<=12 && c2>=0)
				System.out.println("MMYY");
			else if(c1>=0 && c2>0 && c2<=12)
				System.out.println("YYMM");
			else
				System.out.println("NA");
			
			
			
			
		}
	}

}
