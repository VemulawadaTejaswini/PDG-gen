import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		int a = 0, b = 0, o = 0, ab = 0;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			String BloodType = str[1];
			if (BloodType.equals("A")) a++;
			if (BloodType.equals("B")) b++;
			if (BloodType.equals("AB")) ab++;
			if (BloodType.equals("O")) o++;
		}
		System.out.println(a + "\n" + b + "\n" + ab +"\n" + o);
	}

}