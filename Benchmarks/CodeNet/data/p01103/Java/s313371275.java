import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int w = scan.nextInt();
		while(d != 0 || w != 0){
			int[][] e = new int[d][w];
			int min = 9;
			int max = 0;
			for(int i = 0; i < d; i++){
				for(int j = 0; j < w; j++){
					e[i][j] = scan.nextInt();
					if(e[i][j] < min){
						min = e[i][j];
					}
					if(e[i][j] > max){
						max = e[i][j];
					}
				}
			}
			
			int maxpond = 0;
			for(int i = 0; i < d; i++){
				for(int j = 0; j < w; j++){
					int k = i + 2;
					while(d - i >= 3 && d > k){
						int l = j + 2;
						while(w - j >= 3 && w > l){
							int pond = 0;
							int shore = 9;
							boolean check = false;
							for(int m = i; m <= k; m++){
								for(int n = j; n <= l; n++){
									if(m == i || m == k || n == j || n == l){
										if(e[m][n] == min && e[m][n] <= pond){
											check = true;
											break;
										}else if(e[m][n] < shore){
											shore = e[m][n];
										}
									}else{
										if(e[m][n] == max && e[m][n] >= shore){
											check = true;
											break;
										}else if(e[m][n] > pond){
											pond = e[m][n];
										}
									}
								}
								if(check){
									break;
								}
							}
							if(!check){
								int tmp = 0;
								for(int o = i + 1; o < k; o++){
									for(int p = j + 1; p < l; p++){
										tmp += shore - e[o][p];
									}
								}
								if(maxpond < tmp){
									maxpond = tmp;
								}
							}
							l++;
						}
						k++;
					}
				}
			}
			System.out.println(maxpond);
			d = scan.nextInt();
			w = scan.nextInt();
		}
	}
}
