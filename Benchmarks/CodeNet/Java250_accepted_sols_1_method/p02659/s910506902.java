import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long a=sc.nextLong();
	  String s=sc.next();
	  long b0=Long.valueOf(s.substring(0, 1)),b1=Long.valueOf(s.substring(2, 3)),b2=Long.valueOf(s.substring(3, 4));

	  long res0=a*b0,res1=a*b1;
	  res1=res1/10;
	  long m1=((a*b1)%10)*10,m2=a*b2,m3=(m1+m2)/100;
	  System.out.println(res0+res1+m3);
	  //System.out.println(m1);
  }
}

