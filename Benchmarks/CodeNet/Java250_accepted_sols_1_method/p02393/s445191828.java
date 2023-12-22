import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int t,s,y;


	if(a>b){
	  t = a;
	  a = b;
	  b = t;

	   if(b>c){
	      s = b;
	      b = c;
	      c = s;

	       if(a>b){
         	 y = b;
	 	 b = a;
	 	 a = y;
	       }
           }
        }

	if(a==c){
	  t = b;
	  b = c;
	  c = t;
	 } 

	System.out.println(a+" "+b+" "+c);

  }
}