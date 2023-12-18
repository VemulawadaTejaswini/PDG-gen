import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
 	int x = n/2 ;
    int y = n - x ;
    if(n%2 != 0){
    System.out.println((int)Math.pow(x,2)+x);
    }else{
      System.out.println((int)Math.pow(x,2));
    }

  }
}
