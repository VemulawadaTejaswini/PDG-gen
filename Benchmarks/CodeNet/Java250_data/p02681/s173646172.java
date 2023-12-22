
import java.util.*;


 public class Main{

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String x=sc.nextLine();
		int n=x.length();
	
		String r=x.substring(0,n-1);
		
		
		if(r.equals(s))
		{System.out.println("Yes");}
		else
		{System.out.println("No");}
		
		sc.close();

	}

}
