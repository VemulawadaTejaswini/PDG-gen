import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = -1;
    int max2 = -1;
    int maxi = -1;
    for (int i = 0; i < N; i++) {
    	int a = sc.nextInt();
    	if (a > max) {
    		max2 = max;
    		max = a;
    		maxi = i;
    	} else 	if (a > max2) {
    		max2 = a;
    	}
    }
    for (int i = 0; i < N; i++) {
    	System.out.println(i == maxi ? max2 : max);
    }
  }
}
