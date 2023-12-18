import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st1.nextToken());
		int b=Integer.parseInt(st1.nextToken());
		int c=Integer.parseInt(st1.nextToken());
		if(c%a==0){
			c++;
		}
		a++;

		while(a>b){
			if(c%a==0){
				c++;
			}
			a++;
		}

		System.out.println(c);
	}

}
