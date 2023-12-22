import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		String str = br.readLine();
		String[] num = str.split(" ");
		if(num.length > 3) return;
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		
		if(a<b && b<c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}