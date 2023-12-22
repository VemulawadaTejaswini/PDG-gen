

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true){

			int num = in.nextInt();
			int sum = in.nextInt();
			int count = 0;

			if(num == 0 && sum == 0){

				break;

			}else{

				for(int f = 1; f <= (num-2); f++){

					for(int s = f; s <= (num-2); s++){

						for(int t = s; t <= (num-2); t++){

							int S = s+1;
							int T = t+2;

							String c = f + "+" + S + "+" + T + "+";

							if(f + S + T == sum){

								count++;

						}
					}


					}
				}

				System.out.println(count);
			}
		}
	}
}