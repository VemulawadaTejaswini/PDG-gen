import java.util.Scanner;

public class Main{


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
        if(a < b && b < c)
        {
            System.out.println(a + " " + b + " " + c);
        }
        else if(a > b && b > c)
        {
        	System.out.println(c + " " + b + " " + a);
        }
        	else if(a > c)
        	{
        		System.out.println(c + " " + a + " " + b);
        	}
        	else
        	{
        		System.out.println(a + " " + c + " " + b);
        	}        			
        sc.close();
    }