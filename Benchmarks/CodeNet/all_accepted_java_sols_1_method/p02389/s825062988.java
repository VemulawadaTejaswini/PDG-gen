import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String[] strAry = bf.readLine().split(" ");
		int h = Integer.parseInt(strAry[0]);
		int w = Integer.parseInt(strAry[1]);
		System.out.println(h * w + " " + ((h * 2) + (w * 2)));
	}
}