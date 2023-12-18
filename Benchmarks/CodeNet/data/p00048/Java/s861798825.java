import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] min = new int[11];
	static int[] max = new int[11];
	static String[] name = new String[11];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		initialize();

		while ((line = br.readLine()) != null) {
			float weight = Float.parseFloat(line);
			System.out.println(classfy(weight));
		}
	}

	static String classfy(float weight) {
		weight = (int) Math.ceil(weight);
		for (int i = 0; i < 11; i++) {
			if (weight > min[i] && weight <= max[i])
				return name[i];
		}
		return null;
	}

	static void initialize() {
		//
		min[0] = Integer.MIN_VALUE;
		min[1] = 48;
		min[2] = 51;
		min[3] = 54;
		min[4] = 57;
		min[5] = 60;
		min[6] = 64;
		min[7] = 69;
		min[8] = 75;
		min[9] = 81;
		min[10] = 91;
		//
		max[0] = min[1];
		max[1] = min[2];
		max[2] = min[3];
		max[3] = min[4];
		max[4] = min[5];
		max[5] = min[6];
		max[6] = min[7];
		max[7] = min[8];
		max[8] = min[9];
		max[9] = min[10];
		max[10] = Integer.MAX_VALUE;
		//
		name[0] = "light fly";
		name[1] = "fly";
		name[2] = "bantam";
		name[3] = "feather";
		name[4] = "light";
		name[5] = "light welter";
		name[6] = "welter";
		name[7] = "light middle";
		name[8] = "middle";
		name[9] = "light heavy";
		name[10] = "heavy";
	}

}