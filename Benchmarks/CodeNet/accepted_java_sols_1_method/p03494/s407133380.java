import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
    }

	int cnt = 0;
	boolean f = true;
	while (f) {
		cnt++;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				f = false;
				cnt--;
				break;
			}
			a[i] /= 2;
		}
	}
    System.out.println(cnt);
  }
}
