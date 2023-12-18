import java.util.Scanner;

//https://onlinejudge.u-aizu.ac.jp/problems/1153
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  if (n == 0 && m == 0) return;

	  int[] taro = new int[n];
	  int sumOfTaro = 0;
	  for (int i = 0; i < n; i++) {
		sumOfTaro += taro[i] = sc.nextInt();
	  }

	  int[] hanako = new int[m];
	  int sumOfHanako = 0;
	  for (int i = 0; i < m; i++) {
		sumOfHanako += hanako[i] = sc.nextInt();
	  }

	  boolean changePoint = false;
	  for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
		  if (sumOfTaro - sumOfHanako == (taro[i] - hanako[j]) * 2) {
			if (!changePoint) {
			  changePoint = true;
			  System.out.println(taro[i] + " " + hanako[j]);
			}
		  }
		}
	  }
	  if (!changePoint) System.out.println(-1);
	}
  }
}

