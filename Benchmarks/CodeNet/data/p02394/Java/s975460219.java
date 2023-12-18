import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();
		Integer witdh = Integer.parseInt(info.split(" ")[0]);
		Integer height = Integer.parseInt(info.split(" ")[1]);
		Integer x = Integer.parseInt(info.split(" ")[2]);
		Integer y = Integer.parseInt(info.split(" ")[3]);
		Integer r = Integer.parseInt(info.split(" ")[4]);
		if (witdh >= (x + r) && (x-r) >= 0 && height >= (y + r) && (y-r) >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}