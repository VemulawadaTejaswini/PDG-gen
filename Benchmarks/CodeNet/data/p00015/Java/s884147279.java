import java.util.Scanner;
import java.math.BigInteger;

class aoj0015{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;++i){
		BigInteger a=sc.nextBigInteger(),b=sc.nextBigInteger();
		System.out.println((a.add(b).toString().length()>80)?"overflow":a.add(b));
	}
  }
}