import java.util.*;

public class Main {
    static int prog(int n, int k, String s, String t, int depth, int max_depth) {
	int buf_ans, difference = 0, white = 0, black, color;

	for (int i = 0; i < n; i++) {
	    if (s.charAt(i) != t.charAt(i))
		difference++;
	    if ('W' == t.charAt(i))
		white++;
	}
	black = n - white;
	if (black < white) {
	    color = black;
	} else {
	    color = white;
	}
	double times = (double) n / k;
	if (difference < color + Math.ceil(times)) {
	    buf_ans = difference;
	} else {
	    buf_ans = color + (int)Math.ceil(times);
	}

	if (buf_ans + depth < max_depth)
	    max_depth = depth + buf_ans;

	for (int h = 2; h <= k; h++) {
	    for (int i = 0; i < n - h + 1; i++) {
		for (int j = 0; j < 2; j++) {
		    String str = "";
		    char c = 'W';
		    if (j == 1) c = 'B';
		    for (int l = 0; l < i; l++)
                        str += s.charAt(l);
		    for (int l = 0; l < h; l++)
			str += c;
		    for (int l = i + h; l < n; l++)
                        str += s.charAt(l);;
		    if (t.equals(str) && depth < buf_ans) {
			return depth + 1;
		    } else {
			if (depth + 1 < max_depth) {
			    int buf = prog(n, h, str, t, depth + 1, max_depth);
			    if (buf < buf_ans)
				buf_ans = buf;
			}
		    }
		}
	    }

	}
	return buf_ans + depth;

    }
    static public void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.valueOf(scan.next());
	int k = Integer.valueOf(scan.next());
	String s = scan.next();
	String t = scan.next();
	int ans;
	ans = prog(n, k, s, t, 0, n);
	System.out.println(ans);
    }
}
