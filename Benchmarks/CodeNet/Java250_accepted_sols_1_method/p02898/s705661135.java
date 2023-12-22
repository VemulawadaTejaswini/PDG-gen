import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int K = stdin.nextInt();
        int h[] = new int[N];
        int cnt = 0;
        
        for(int i= 0;i<N;i++) {
        	h[i] = stdin.nextInt();
        	if(h[i] >= K) {
        		cnt+=1;
        	}
        }
        
        System.out.println(cnt);
    }
}
