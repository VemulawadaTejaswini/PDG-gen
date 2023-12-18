import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    int N = s.nextInt();
	    if(N == 0) break;
	    int[] a = new int[N];
	    int[] b = new int[N];
	    String message = s.next();
	    char[] str = message.toCharArray();
	    for(int i = 0; i < N; ++i) {
		a[i] = s.nextInt(); b[i] = s.nextInt();
		--a[i]; --b[i];
	    }
	    for(int i = N-1; i >= 0; --i) {
		int d = Math.abs(a[i]-b[i]);
		str[a[i]] = (char)((str[a[i]]-'a'+d)%26+'a');
		str[b[i]] = (char)((str[b[i]]-'a'+d)%26+'a');
		char t = str[a[i]];
		str[a[i]] = str[b[i]];
		str[b[i]] = t;
	    }
	    System.out.println(String.valueOf(str));
	}
    }
}