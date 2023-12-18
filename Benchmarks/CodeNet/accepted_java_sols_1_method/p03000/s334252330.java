import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N];
    int cnt = 1;
    int length = 0;

    for(int i = 0; i < N; i++) {
    	L[i] = sc.nextInt();
    	length += L[i];
    	if(length <= X) {
    		cnt++;
    	}
    }
    System.out.println(cnt);
  }
}