import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strNumArrays = br.readLine().split(" ");
		String answer = "";
		Integer a = Integer.parseInt(strNumArrays[0]);
		Integer b = Integer.parseInt(strNumArrays[1]);
		answer += a / b;
		answer += " " + a % b;
		double dA = Double.valueOf(a);
		double dB = Double.valueOf(b);
		answer += " " + String.format("%.5f", dA / dB);
		System.out.println(answer);
	}

}