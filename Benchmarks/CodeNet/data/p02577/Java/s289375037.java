import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		//code
	Scanner in=new Scanner(System.in);
        int t,k,i,x;
        long j=0;
        double m;
        
            String s=in.next();
            System.out.println(s);
        
           
            
                 for(i=0;i<s.length();i++)
            {
                //System.out.println(Integer.valueOf(s.charAt(i)));
                j+=Integer.valueOf(s.charAt(i))-48;
                 //System.out.println(j);
            }
           
            if(j%9==0)
            System.out.println("Yes");
            else
            System.out.println("No");
            

               
	}
}

/**/