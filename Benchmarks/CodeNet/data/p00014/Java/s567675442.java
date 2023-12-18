import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int width, height, repeat;
			int area;

			while ((str = br.readLine()) != null) {
				//Input Initialize
				width = Integer.parseInt(str);
				repeat = 600 / width;
				height = 0; area = 0;
				//Integral
				for (int i = 0; i < repeat; i++) {
					height = (i * width) * (i * width) * width;
					area += height;
				}
				System.out.println(area);
			}
		} catch (Exception e) {
			System.out.println("error");
		}

	}

}