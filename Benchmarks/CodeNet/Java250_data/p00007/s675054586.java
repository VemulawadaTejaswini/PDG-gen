import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 100000;
		double debt = sum * 0.05;
		
		for (int i = 0; i < n; i++) {
			sum += debt;
			if (sum % 1000 != 0) {
				sum -= sum % 1000;
				sum += 1000;
			}
			debt = sum * 0.05;
		}
		System.out.println(sum);
	}

}