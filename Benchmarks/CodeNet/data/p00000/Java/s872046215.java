import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int k = i * j;
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println("");
		}
    }
}