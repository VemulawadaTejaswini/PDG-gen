
import java.math.BigInteger;
import java.util.Scanner;

class Main {
    
    public static int log10(BigInteger number) {
  double factor = Math.log(2) / Math.log(10);
  int digitCount = (int) (factor * number.bitLength() + 1);
  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
    return digitCount - 1;
  }
  return digitCount;
}


public static void main(String []args){

    int n;
 Scanner sc= new Scanner(System.in); 
   n=sc.nextInt();
  for(int i=1; i<=n;i++){
BigInteger a = sc.nextBigInteger();
BigInteger b = sc.nextBigInteger();

if (log10(a.add(b))>80 || log10(a)>80 || log10(b)>80 ) {System.out.println("overflow");}
else System.out.println(log10(a.add(b)));

   }
}

}