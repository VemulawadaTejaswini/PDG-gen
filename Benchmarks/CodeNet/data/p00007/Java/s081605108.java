import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double debt = 100000;
		for(int i=1;i<n+1;i++){
			debt *= 1.05;
		}
		debt/=10000;
		System.out.println((int)(Math.ceil(debt)*10000));
	}
}