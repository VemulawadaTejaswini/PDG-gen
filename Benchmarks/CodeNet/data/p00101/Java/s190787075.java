import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] a = new String[n];
		
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			str = str.replaceAll("Hoshino", "Hoshina");
			
			a[i] = str;
		}
		
		for(String i : a) {
			System.out.println(i);
		}
	}
}