import java.util.*;

public class Main {
    public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	for(int tc = 0; tc < N; ++tc) {
	    int[] e = new int[3];
	    for(int i = 0; i < 3; ++i) {
		e[i] = s.nextInt();
	    }
	    Arrays.sort(e);
	    if(e[0]*e[0] + e[1]*e[1] == e[2]*e[2])
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
    }
}