import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader re = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(re);
		
		int counter = 0;
		while (true) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				break;
			}
			
			counter++;
			System.out.println("Case " + counter + ": " + num);
		}
	}
}