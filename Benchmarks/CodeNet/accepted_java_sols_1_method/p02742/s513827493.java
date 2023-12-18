import java.util.*;
public class Main {
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	  long h=input.nextLong();long w=input.nextLong();
	  long sum=0;
	  if(w==1||h==1)System.out.print(1);
	  else
	  {
	  if(w%2==0)sum=(long)h*w/2;
	  else
	  {
		  long k=h/2;
		  sum+=(long)k*((w+1)/2+(w-1)/2);
		  if(h%2==1)sum+=(w+1)/2;
	  }
	  System.out.println(sum);
 }
}
}