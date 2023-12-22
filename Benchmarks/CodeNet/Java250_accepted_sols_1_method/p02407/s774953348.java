import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String sz_input = br.readLine();
		String[] sz_number = sz_input.split(" ");
		
		for (int i = n-1; i>=0; i--) {
			System.out.print(Integer.parseInt(sz_number[i]));
			if (i > 0) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
}