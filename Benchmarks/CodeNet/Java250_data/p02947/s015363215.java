import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		String s[] = new String[N];
		long cnt = 0;
		
		
		for(int i=0;i<N;i++) {
			s[i] = stdin.next();
		}
		for(int h=0;h<N;h++) {
			char[] copy = s[h].toCharArray();
			Arrays.sort(copy);
			s[h] = new String(copy);
		}
		Arrays.sort(s);

		for(int i=0;i<N-1;i++) {
			int j=i+1;
			long sin=1;
			while(s[i].equals(s[j])) {
					if(j!=N-1) {
						j+=1;
						sin+=1;
					}
					else {
						sin+=1;
						break;
					}
			}
			cnt+=(sin*(sin-1))/2;
			i=j-1;
		}

		out.println(cnt);

		out.flush();
	}

	
}