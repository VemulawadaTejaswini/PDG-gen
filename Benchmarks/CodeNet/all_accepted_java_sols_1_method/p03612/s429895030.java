import java.util.Arrays;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int N = in.nextInt();
	int p[] = new int[N+1];
	int ans = 0;
	Arrays.fill(p, 0);

	for(int cnt = 0;cnt < N; cnt++){
		p[cnt] = in.nextInt();
	}

	for(int cnt = 0; cnt < N; cnt++){
		if(p[cnt] == cnt+1){
			int tmp = p[cnt];
			p[cnt] = p[cnt+1];
			p[cnt+1] = tmp;
			ans++;
		}
	}

	System.out.println(ans);

}
}