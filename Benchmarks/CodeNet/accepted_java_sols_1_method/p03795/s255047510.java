import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int fifteen_count = n / 15;
            
        System.out.println(800*n - 200*fifteen_count);
	  }
}