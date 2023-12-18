import java.util.*;
class Main{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
      int num = 0;
      while(N > 0){
        num += N%10;
        N /= 10;
      }
      if(num%9==0) System.out.println("Yes");
      else System.out.println("No");
	}
}