import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String[] strNumArrays = null;
		String answer = "";
		if (in == null || "".equals(in)) {
			System.out.println("0 0 0");
		} else {
			try {
				strNumArrays = in.split(" ");
			} catch (Exception e) {
				System.out.println("0 0 0");
			}
			if ("0".equals(strNumArrays[0]) || "0".equals(strNumArrays[1])) {
				System.out.println("0 0 0");
			} else {
				Integer a = Integer.parseInt(strNumArrays[0]);
				Integer b = Integer.parseInt(strNumArrays[1]);
				answer += a / b;
				answer += " " + a % b;
				float fA = Float.valueOf(a);
				float fB = Float.valueOf(b);
				answer += " " + String.format("%.5f", fA / fB);
				System.out.println(answer);
			}
		}
	}

}