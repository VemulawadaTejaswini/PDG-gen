import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n =scan.nextInt();
    long  x = 1L ;
    int mod = (int)(1e9 + 7) ;
    for(int i = 2 ; i<=n ; i++){
		x = (x*i) %  mod ;
    }
    System.out.println(x);
  }
}