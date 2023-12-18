import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] a = new int [k];
		int [] b = new int [k];
		int [][] array = new int [6][n+1];
		int answer = 0;
		for(int i = 0; i < k; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			int count1 = 0;
			if(i == 1){
				for(int j = 0; j < k; j++) {
					if(a[j] == i){
						if(b[j] == 1){
							array[1][i]++;
							count1++;
						}
						else if(b[j] == 2){
							array[3][i]++;
							count1++;
						}
						else if(b[j] == 3){
							array[5][i]++;
							count1++;
						}
					}
				}
				if(count1 == 0){
					array[1][i]++;
					array[3][i]++;
					array[5][i]++;
				}
			}
		}
		for(int i = 1; i <= n; i++){
			int count = 0;
			int countb1 = 0;
			int countb2 = 0;
			int countb3 = 0;
			if(i != 1){
				for(int j = 0; j < k; j++){ 
					if(a[j] == i){
						count++;
						if(b[j] == 1){
							array[0][i] = array[1][i - 1];
							for(int l = 0; l < 6; l++){
								if(l > 1){
									countb1 = countb1 % 10000 + array[l][i - 1] % 10000;
									array[1][i] = countb1;
								}
							}
						}
						else if(b[j] == 2){
							array[2][i] = array[3][i-1];
							for(int l = 0; l < 6; l++){
								if(2 > l || 3 < l){
									countb2 = countb2 % 10000 + array[l][i - 1] % 10000;
									array[3][i] = countb2;
								}
							}
						}
						else if(b[j] == 3){
							array[4][i] = array[5][i-1];
							for(int l = 0; l < 6; l++){
								if(4 > l){
									countb3 = countb3 % 10000 + array[l][i - 1] % 10000;
									array[5][i] = countb3;
								}
							}
						}
					}
				}
				if(count == 0){
					for(int l = 0; l < 6; l++){
						if(l == 0 || l == 2 || l == 4){
							array[l][i] = array[l+1][i-1];
						}
						else if(l == 1){
							int counter = 0;
							for(int m = 0; m < 6; m++){
								if(1 < m){
									counter = counter % 10000 + array[m][i - 1] % 10000;
								}
							}
							array[l][i] = counter;
						}
						else if(l == 3){
							int counter = 0;
							for(int m = 0; m < 6; m++){
								if(2 > m || m > 3){
									counter = counter % 10000 + array[m][i - 1] % 10000;
								}
							}
							array[l][i] = counter;
						}
						else {
							int counter = 0;
							for(int m = 0; m < 6; m++){
								if(m < 4){
									counter = counter % 10000 + array[m][i - 1] % 10000;
								}
							}
							array[l][i] = counter;
						}
					}
				}				
			}
		}
		for(int l = 0; l < 6; l++){
			answer = answer % 10000 + array[l][n] % 10000;
		}
		System.out.println(answer % 10000);
	}
}