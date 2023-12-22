import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] integer = new int[n];
    
    for (int i = 0; i < integer.length; i++) 
      integer[i] = sc.nextInt();
    
   	int count = 0;
    loop : while (true) {
	    for (int i = 0; i < integer.length; i++) {
          if (integer[i] % 2 == 0)
	          integer[i] /= 2;
          else 
            break loop;
        }
      	count++;
    }
    
    System.out.println(count);
  }
}
      