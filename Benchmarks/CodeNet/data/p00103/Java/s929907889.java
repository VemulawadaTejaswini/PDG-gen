import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner stdin = new Scanner(System.in);
		int out_count = 0;
		int hit_count = 0;
		int datasetNum = stdin.nextInt(); 
		int[] point = new int[datasetNum];
		for(int i = 0; i < datasetNum; i++) {
			while(out_count != 3) {

				try {
					String ening = input.readLine();
					if(ening.equals("HIT")) {
						hit_count++;
					} else if(ening.equals("OUT")) {
						out_count++;
					} else if(ening.equals("HOMERUN")) {
						
							point[i] += (hit_count + 1);
							hit_count = 0;
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