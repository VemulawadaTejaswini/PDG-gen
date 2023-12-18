import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {

			int n = sc.nextInt();

			int aa;
			int b;
			int c;
			int d;

			int count = 0;

			for(int i = 0; i < 10; i++) {
				aa = i;
				for(int j = 0; j < 10; j++) {
					b = j;
					for(int k = 0; k < 10; k++) {
						c = k;
						for(int l = 0; l < 10; l++) {
							d = l;
							if((aa + b + c + d) == n) {
								count++;
							}
						}
					}
				}
			}

			System.out.println(count);
		}

	}


}