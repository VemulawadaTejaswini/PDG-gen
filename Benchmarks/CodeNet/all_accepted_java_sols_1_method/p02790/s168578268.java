import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Main {
  public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String tokens[] = scanner.nextLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        for(int i = 0; i < max; i++) {
        	System.out.print(min);
        }
        
  }
}
