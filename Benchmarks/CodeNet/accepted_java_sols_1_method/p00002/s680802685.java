import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
     
        while(in.hasNext()) {
            int i = in.nextInt();
            int j = in.nextInt();
            
            System.out.println(Integer.toString(i+j).length());
	    }
	}
}