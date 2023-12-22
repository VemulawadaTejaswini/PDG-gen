import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = 0, x = 0;

		n = scane.nextInt();
		x = scane.nextInt();

		int count =0;


		while ((n+x) != 0) {

			count =0;

			for(int i= n; i>0; --i ){
				for(int j = i-1; j>0; --j){
					for(int t =j-1; t>0; --t){

						if((i+j+t) == x){
							count++;
						}

					}
				}
			}

			System.out.println(count);



			n = scane.nextInt();
			x = scane.nextInt();

		}



	}
}