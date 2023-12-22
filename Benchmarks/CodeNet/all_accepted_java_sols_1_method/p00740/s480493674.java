import java.util.Scanner;

//https://onlinejudge.u-aizu.ac.jp/problems/1159
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	  int n = sc.nextInt();
	  int p = sc.nextInt();
	  int[] stoneOfCandidates = new int[n];

	  if (n == 0 && p == 0) break;
	  int stoneRemain = p;
	  int result = 0;

	  while (true) {
		if (stoneRemain > 0) {
		  stoneOfCandidates[result]++;
		  stoneRemain--;
		} else {
		  stoneRemain += stoneOfCandidates[result];
		  stoneOfCandidates[result] = 0;
		}
		if (stoneOfCandidates[result] == p) break;
		result++;
		if (result == n) result = 0;
	  }
	  System.out.println(result);
	}
  }
}

