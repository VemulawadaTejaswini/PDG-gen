

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		int mod = 1_000_000_007;
		long modCount[][] = new long[str.length][13];

		int geta = 1;
		for(int i = str.length - 1; i >= 0; i--){
//			System.out.println("i = "+i);
			if(str[i] == '?'){
				for(int j = 0; j <= 9; j++){
					int tmp = j*geta % 13;

					if(i < str.length - 1){
						for(int k = 0; k < 13; k++){
							modCount[i][(tmp + k) % 13] += modCount[i + 1][k];
							modCount[i][(tmp + k) % 13] %= mod;
						}
					}
					else {
						modCount[i][j] = 1;
					}
				}
			}
			else {
				int num = str[i] - '0';
				int tmp = num*geta%13;

				if(i == str.length - 1){
					modCount[i][tmp] = 1;
				}
				else {
					for(int j = 0; j < 13; j++){
						modCount[i][(tmp + j)%13] += modCount[i + 1][j];
						modCount[i][(tmp + j)%13] %= mod;
					}
				}
			}

			geta *= 10;
			geta %= 13;
//			for(int j = 0; j < 13; j++){
//				System.out.print(modCount[i][j]+" ");
//			}
//			System.out.println();
		}

		System.out.println(modCount[0][5]);

	}

}
