import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//?????°?¨????
        int[] Mountain = new int[10];
        int i = 0;
        int first = 0, second = 0, third = 0;
		String line;

		//???????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (i = 0; i < 10; i++) {
				line = br.readLine();
				Mountain[i] = Integer.parseInt(line);
				//????????????
				if (Mountain[i] > first) {
					third = second;
					second = first;
					first = Mountain[i];
					continue;
				} else if (Mountain[i] > second) {
					third = second;
					second = Mountain[i];
					continue;
				} else if (Mountain[i] > third) {
					third = Mountain[i];
					continue;
				}
			}
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
	}
}