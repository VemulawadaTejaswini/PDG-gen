import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int N = sc.nextInt();
		
		int p[] = new int[N];
		int org[] = new int[N];
		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
			org[i] = p[i];
		}
		Arrays.sort(p);
		
		int check = 0;
		for(int i=0;i<N;i++) {
			if(p[i]!=org[i]) {
				if(check==2) {
					out.println("NO");
					return;
				}
				check++;
			}
		}
		out.println("YES");
		sc.close();
	}
}