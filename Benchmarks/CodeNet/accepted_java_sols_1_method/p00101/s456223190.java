import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ; i++){
			String a = br.readLine();
			a = a.replaceAll("Hoshino","Hoshina");
			System.out.println(a);
		}
	}
}