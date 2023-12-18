import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer dictionary = new StringBuffer();

		for (int i = 0; i < n; i++) {
			StringBuffer str = new StringBuffer(br.readLine());
			if (str.toString().contains("insert ")) {
				dictionary.append(str).delete(0, 7);
				System.out.println(dictionary.toString());
			} else {
				if(dictionary.toString().contains(str.delete(0, 5))) {
					System.out.println("Yes");
				} else{
					System.out.println("NO");
				}
			}
		}
	}
}

	