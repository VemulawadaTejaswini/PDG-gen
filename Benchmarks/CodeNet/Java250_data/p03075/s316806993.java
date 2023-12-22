
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {
		int antenna[] = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<antenna.length; i++) {
			antenna[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		if(antenna[4] -antenna[0] > k) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
	}

}
