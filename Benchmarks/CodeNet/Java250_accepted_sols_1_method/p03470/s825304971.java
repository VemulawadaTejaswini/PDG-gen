import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		long cnt = stdin.lines().skip(1).sorted().distinct().count();
		System.out.println(cnt);
	}

}