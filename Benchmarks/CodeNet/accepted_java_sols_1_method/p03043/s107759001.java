import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        int N =Integer.parseInt(in.nextToken());
        int K =Integer.parseInt(in.nextToken());
        in = null;
        br = null;
        double ans = 0.0;

        for (int i = 1; i <= N; i++) {
        	int tmp = i;
        	double d = 1.0 / N;
        	while (K > tmp) {
        		tmp *= 2;
        		d /= 2;
        	}
        	ans += d;
        }

        System.out.println(ans);

	}

}
