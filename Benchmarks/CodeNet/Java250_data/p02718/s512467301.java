import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] As = new int[N];
    int total = 0;
    long count = 0;
    for (int i = 0; i < N; i++) {
    	As[i] = sc.nextInt();
    	total += As[i];
    }
    for (int i = 0; i < N; i++) {
    	if(total <= (As[i] * 4 * M)) count++;
    }
    System.out.println(M <= count ? "Yes" : "No");
  }
}
