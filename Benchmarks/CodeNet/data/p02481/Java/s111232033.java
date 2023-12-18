import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt();
	System.out.printf("%d %d\n",a*b,2*(a+b));
  }
}