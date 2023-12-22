import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int[] a = new int[5];
        
    for (int i = 0; i < 5; i++) {
    	a[i] = scan.nextInt();
    }
    
    int k = scan.nextInt();
    
    if (a[4] - a[0] > k) {
    	System.out.print(":(");
    } else {
    	System.out.print("Yay!");
    }
  }
}
