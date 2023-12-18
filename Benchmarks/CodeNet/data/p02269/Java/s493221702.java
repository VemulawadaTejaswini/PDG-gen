import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		 int n,i;
	        Scanner scan=new Scanner(System.in);
	        n=scan.nextInt();
	        Set<String>d=new HashSet<String>();
	        for(i=0;n<i;i++)
	        {
	        	String a=scan.next();
		        String b=scan.next();
	            if(a.equals("insert"))
	            {
	            	d.add(b);
	            }
	            else
	            {
	            	System.out.println((d.contains(b)) ? ("yes"):("no"));
	            }
	        }
	}

}