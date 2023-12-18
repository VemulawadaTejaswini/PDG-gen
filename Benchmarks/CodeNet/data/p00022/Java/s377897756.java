import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader sr = null;
		Scanner sc = null;
		int datasets = 0;
		int value = 0;
		int max = 0;

		try {
			sc = new Scanner(sr = new InputStreamReader(System.in));

			while ((datasets = sc.nextInt()) != 0) {

				for (int i = 1; i <= datasets; i++) {

					value += sc.nextInt();

					if(max<value){

						max=value;

					}

				}


				System.out.println(max);
			}

		} catch (NoSuchElementException e) {

		}

		finally {
			sr.close();
			sc.close();
		}

	}

}