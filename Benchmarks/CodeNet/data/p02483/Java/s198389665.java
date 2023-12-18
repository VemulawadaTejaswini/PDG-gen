import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a==c)
        {
        	if(a<b)
        		System.out.println(a+" "+c+" "+b);
        	else
        		System.out.println(b+" "+a+" "+c);
        }
        else{
        if(a==b)
        {
        	if(a<c)
        		System.out.println(a+" "+b+" "+c);
        	else
        		System.out.println(c+" "+b+" "+a);
        }
        else
        {
        	if(b==c)
        	{
        		if(a<b)
            		System.out.println(a+" "+b+" "+c);
            	else
            		System.out.println(c+" "+b+" "+a);
            	}
        else{
        if(a<b&&b<c)
            System.out.println(a +" "+ b +" "+ c);
        else{
        	if(a<b&&c<a)
            System.out.println(c +" "+ a +" "+ b);
        	else{
        		if(a<b&&a<c)
        	System.out.println(a + " " + c + " " + b);
           	else{
        	    if(b<a&&a<c)
            System.out.println(b +" "+ a +" "+ c);
                else
                	if(b<a&&c<b)
            System.out.println(c +" "+ b +" "+ a);
                	else
                	System.out.println(b +" "+ c +" "+ a);
           	}
           	}
        }
    }
}
}
}
}