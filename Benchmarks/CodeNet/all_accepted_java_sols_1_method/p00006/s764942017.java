import java.io.*;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine();
		int K = str.length();
		for(int a = K-1;a >= 0;a--){
			if(a==0){
				System.out.println(str.charAt(a));
			}else{
				System.out.print(str.charAt(a));
			}
		}
	}
}