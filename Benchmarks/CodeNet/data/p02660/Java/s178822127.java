import java.util.*;
public class Main{
  static boolean isPrime (long n) {
	if (n==2) return true;
	if (n<2 || n%2==0) return false;
	int d = (int)Math.sqrt(n);
	for (int i=3; i<=d; i+=2) {
		if(n%i==0){return false;}
	}
	return true;
  }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    if (isPrime(N) == true){System.out.println(1);}
    else{
    long x=2;
    long a=0;
    while(N>=x){
      if(N%x==0){a=a+1;N=N/x;}
      x=x+1;}
    System.out.println(a);}
  }
}