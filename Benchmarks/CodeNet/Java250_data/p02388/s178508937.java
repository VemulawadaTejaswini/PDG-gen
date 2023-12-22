import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num_ = br.readLine();
		int num = Integer.parseInt(num_);
		num = num*num*num;
		System.out.println(num);
	}
}