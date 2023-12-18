import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H[] = new int[N];
    for(int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }
    int max = 0;
    int cnt = 0;
    for(int i  = 0; i < N-1; i++) {
      if(H[i+1] <= H[i]) {
        cnt++;
      }else {
        cnt = 0;
      }
      if(max < cnt) {
        max = cnt;
      }
    }
    System.out.println(max);
	}
}