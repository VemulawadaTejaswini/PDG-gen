import java.util.Scanner;
class Main{
  public static void main(String[] args) {
  Scanner scan =  new Scanner(System.in);
 int a = scan.nextInt();
 long b=1;
 long c =  (long)Math.pow(10, 9)+7;
 for(int i=1;i<=a;i++){
	 b=i*b % c;
 }
   System.out.println(b);
  }
}