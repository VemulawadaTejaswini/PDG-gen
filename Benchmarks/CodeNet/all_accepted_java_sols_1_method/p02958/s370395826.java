import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       
    int n = scan.nextInt();
    int[] p = new int[n];
    
    for (int i = 0; i < n; i++) {
      p[i] = scan.nextInt();
    }
    
    for (int k = 0; k < n - 1; k++) {
    	if (p[k] > p[k+1]) {
    		break;
    	} else if (k == (n - 2)) {
    		System.out.print("YES");
    		return;
    	}
    }
    
    int[] q = new int[n];
    
    for (int i = 0; i < n - 1; i++) {    
      for (int j = i + 1; j < n; j++) {
    	for (int k = 0; k < n; k++) {
			 q[k] = p[k];
		}
		q[i] = p[j];
		q[j] = p[i];
		
		for (int k = 0; k < n - 1; k++) {
			if (q[k] > q[k+1]) {
				break;
			} else if (k == (n - 2)) {
				System.out.print("YES");
				return;
			}
		}
      }
    }
    
    System.out.print("NO");
    return;
  }
}
