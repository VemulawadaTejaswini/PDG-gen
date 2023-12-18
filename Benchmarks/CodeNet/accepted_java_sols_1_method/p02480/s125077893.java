import java.io.*;
class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String x = buf.readLine();
		int n = Integer.parseInt(x);
		int ans = 1;
		for(int i = 0; i < 3; i++){
			ans *= n;
		}
		System.out.println(ans);
	}

}