import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	int N = sc.nextInt();
	boolean[] isP = new boolean[101];
	for (int i=0;i<N;i++) {
	    isP[sc.nextInt()] = true; //trueは使用してはいけない
	}
	int result = -1;
	int nowsa = Integer.MAX_VALUE;
	for (int i=1;i<101;i++) {
	    if (isP[i] != true) {
		if (nowsa > Math.abs(X-i)) {
		    nowsa = Math.abs(X-i);
		    result = i;
		} else if (nowsa == Math.abs(X-i)) {
		    if (i < result) result = i;
		}
	    }
	}
	System.out.print(result);
    }
}
