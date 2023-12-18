import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		int n = Integer.parseInt(sc);
		String line2 = br.readLine();
		String[] str = line2.split(" ");
		for (int i = 0; i<n ; i++ ) {
			int x = Integer.parseInt(str[i]);
			if (i < n-1){
				System.out.print(x + " ");
			}else{
				System.out.print(x + "\n");
			}
		}
	}
}