import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Main m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte[] v = new byte[6];
		boolean c = true;
		for(int i = 0; i < 6; i++) {
			v[i] = Byte.valueOf(in.readLine());
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j || !c) {
					continue;
				}
				if(Math.abs(v[i] - v[j]) > v[5]) {
					c = false;
					break;
				}
			}
		}
		System.out.println(c?"Yay!":":(");
	}
}
