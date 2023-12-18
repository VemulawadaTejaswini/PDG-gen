import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ss = Integer.parseInt(br.readLine());
		System.out.print(ss/3600 + ":");
		int s =ss%3600;
		System.out.print(s/60 +":");
		int m = s%60;
		System.out.println(m%60);
	}
}