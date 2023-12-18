import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long a=sc.nextLong();
	  String s=sc.next();
	  long b0=Long.valueOf(s.substring(0, 1)),b1=Long.valueOf(s.substring(2, 3)),b2=Long.valueOf(s.substring(3, 4));

	  long res1=a*b2,res2=a*b1,res3=a*b0;
	  res1=res1/100;
	  long buff1=res1%100;
	  res2=res2/10;
	  long buff2=(res2%10)*10;
	  long buff3=(buff1+buff2)/100;
	  System.out.println(res1+res2+res3+buff3);
  }
}

