import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String hit = "HIT";
		String homerun = "HOMERUN";
		String out = "OUT";
		int datasetNum = 1;
		int out_count = 0;
		int hit_count = 0;
		int[] point = new int[datasetNum];
		for(int i = 0; i < datasetNum; i++) {
			while(out_count != 3) {

				try {
					String ening = input.readLine();
					if(ening.equals(hit)) {
						hit_count++;
					} else if(ening.equals(out)) {
						out_count++;
					} else if(ening.equals(homerun)) {
						if(hit_count == 0) {
							point[i]++;
						} else {
							point[i] += hit_count;
							hit_count = 0;
						}
					}

					if(hit_count > 3) {
						point[i]++;
						hit_count = 3;
					}


				} catch (IOException e) {
					System.out.println("fajfalsjf;lkasdjfkadjf");
				}


			}
			out_count = 0;
			hit_count = 0;
		}

		for(int i = 0; i < datasetNum; i++) {
			System.out.println(point[i]);
		}


	}

}