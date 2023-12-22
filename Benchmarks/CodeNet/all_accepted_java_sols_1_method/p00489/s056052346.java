import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0,w=0,cnt=1;
		
		int n = sc.nextInt();
		
		int [][] jun = new int [2][n+1];
		
		int [][] kumi = new int [n*(n-1)/2][4];
		
		for(int i = 0; i < n*(n-1)/2; i++){
			for(int j = 0; j < 4; j++){
				kumi[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i <= n; i++){
			jun[0][i] = x;
			x++;
			jun[1][i] = 0;
		}
		for(int j = 0; j < n*(n-1)/2; j++){
			w=0;
			if(kumi[j][2]>kumi[j][3]){
				w=2;
			}else if(kumi[j][2]<kumi[j][3]){
				w=3;
			}else if(kumi[j][2]==kumi[j][3]){
				w=0;
			}
			if(w==2){
				jun[1][kumi[j][0]] += 3;
			}
			if(w==3){
				jun[1][kumi[j][1]] += 3;
			}
			if(w==0){
				jun[1][kumi[j][0]] += 1;
				jun[1][kumi[j][1]] += 1;
			}
		}
		for(int m = 1; m < n+1; m++){
			cnt = 1;
			for(int k = 1; k < n+1; k++){
				if(jun[1][m]<jun[1][k]){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		// TODO Auto-generated method stub

	}

}