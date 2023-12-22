import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int a,b,c;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        while(a!=0)
        {
        	if(a>=b)
            {
            	a=a%b;
            }
             else if(b>a)
        	{
        		c=b;
        		b=a;
        		a=c;
        		a=a%b;
        	}
        }
        System.out.println(b);
        
	}

}