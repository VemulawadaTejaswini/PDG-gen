import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] array = new int[n];
			array[0] = n;
			
			System.out.println(n);
			while (true) {
				boolean updated = false;
				
				for (int i = n - 1; i >= 0; i--) {

					if (array[i] == 0) {
						continue;
					}

					int pos = -1;

					for (int j = i + 1; j < n; j++) {
						if (array[i] - array[j] >= 2) {
							pos = j;
							break;
						}
					}

					if (pos == -1) {
						continue;
					}

					array[i]--;
					array[pos]++;
					updated = true;
					
					for(int j = 0; j < n; j++){
						if(array[j] == 0){break;}
						System.out.print(j == 0 ? array[j] : (" " + array[j]));
					}
					System.out.println();
				}
				
				if(!updated){
					break;
				}
			}
		}

	}

}