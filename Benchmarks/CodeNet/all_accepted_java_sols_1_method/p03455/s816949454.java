import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strArry = bf.readLine().split(" ");
		String[] map = {"Even","Odd"};
		int total = Integer.parseInt(strArry[0]) * Integer.parseInt(strArry[1]);
		System.out.println(map[(int)(total % 2)]);
	}
}
