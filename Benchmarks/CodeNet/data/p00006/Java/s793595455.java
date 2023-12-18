import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
		String s;
		while((s = reader.readLine()) != null){
			int n = s.length();
			char[] t = new char[n];
			for(int i = 0;i<n;i++){
				int m = n-1;
				t[m-i] = s.charAt(i);
			}
			for(int j = 0;j<n;j++){
				System.out.print(t[j]);
				System.out.println("");
			}
		}
		}catch(IOException e){
			System.exit(0);
		}
	}
}