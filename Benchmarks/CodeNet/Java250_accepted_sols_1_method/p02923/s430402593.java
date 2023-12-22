import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		int H[] = new int[N];
		int max = 0;
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			H[i] = Integer.parseInt(stdin.next());
		}
		
		for(int i=0;i<N-1;i++) {
			if(H[i] >= H[i+1]) {
				cnt+=1;
			}
			else if(H[i] < H[i+1]) {
				if(max < cnt) {
					max=cnt;
				}
				cnt=0;
			}
		}
		if(max<cnt) {
			max = cnt;
		}
		System.out.println(max);
		
		out.flush();
	}

}
