package c02;

import java.util.Scanner;

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
        	if(b>a)
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