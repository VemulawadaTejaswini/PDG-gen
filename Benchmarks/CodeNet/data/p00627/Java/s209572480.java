import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			/* input */
			while(true){
				line = br.readLine();
				int n = Integer.parseInt(line), sum = 0;
				if(n==0) break;
				for(int i=0;i<n/4;i++){
					sum += Integer.parseInt(br.readLine());
				}
				System.out.println(sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}