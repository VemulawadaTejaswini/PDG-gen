import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());

			if(n==0 && x==0) {
				break;
			}

			int count=0;
			for(int a=1;a<=n;a++){
				for(int b=1;b<=n;b++) {
					for(int c=0;c<=n;c++) {
						if(a+b+c==x && a<b && b<c) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}

