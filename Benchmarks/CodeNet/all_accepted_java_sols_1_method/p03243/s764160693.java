import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = n/100;
      int c = n%10;
      int b = (n-100*a-c)/10;
      if(a==b&&b==c)System.out.println(n);
      else if(a<b)System.out.println( (a+1)*111 );
      else if(a>b)System.out.println(a*111);
      else if(a==b&&b>c)System.out.println(a*111);
      else if(a==b&&b<c)System.out.println( (a+1)*111 );
    }
}
