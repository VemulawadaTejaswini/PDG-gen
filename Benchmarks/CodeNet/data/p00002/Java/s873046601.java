import java.util.*;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	double a,b;
    	int c;

    	a = sc.nextInt();
    	b = sc.nextInt();
		
    	c = (int)Math.log10(a+b);

    	System.out.println(c+1);
   	}
}

