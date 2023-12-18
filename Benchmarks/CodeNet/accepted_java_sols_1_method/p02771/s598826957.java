import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="No";
		long a=sc.nextLong();
      long b=sc.nextLong();
      long c=sc.nextLong();
        if((a==b&&b!=c)||(a==c&&b!=c)||c==b&&a!=c)o="Yes";
      	System.out.println(o);
    }
    
}