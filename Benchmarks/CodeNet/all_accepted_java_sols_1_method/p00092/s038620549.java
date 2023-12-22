import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  while (in.hasNext()) {
	int n = in.nextInt();
	int[] pre = new int[n];
	int[] now = new int[n];
	int max = 0;
	for (int line = 0; line < n; line++) {
	  String str = in.next();
	  for (int posi = 0; posi < str.length(); posi++) {
		final int pp;
		if (str.charAt(posi) == '*') {
		  pp = 0;
		} else {
		  final int uppr = pre[posi];// Upper
		  final int lfet;// Left
		  final int uplf;// upper-left
		  if (posi != 0) {
			lfet = now[posi - 1];
			uplf = pre[posi - 1];
		  } else {
			lfet = uplf = 0;
		  }
		  pp = Math.min(Math.min(uppr, lfet), uplf) + 1;
		}
		now[posi] = pp;
		max = Math.max(max, pp);
	  }
	  if (line < n - 1) {
		int[] buf = pre;
		pre = now;
		now = buf;
	  } else {
		System.out.println(max);
	  }
	}
  }
}
}