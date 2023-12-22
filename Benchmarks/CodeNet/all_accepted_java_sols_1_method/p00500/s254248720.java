import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x[][] = new int[n][3];
		int y[][] = new int[n][3];

		for(int i=0; i<n; i++){
			for(int k=0; k<3; k++){
				x[i][k] = s.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int k=0; k<n; k++){
				for(int e=0; e<n; e++){
					if(k != e){
						if(x[k][i] == x[e][i]){
							y[k][i] = 0;
							break;
						}
						else		y[k][i] = x[k][i];
					}
				}
			}
		}

		for(int i=1; i<3; i++){
			for(int k=0; k<n; k++){
				y[k][0] += y[k][i];
			}
		}
		for(int i=0; i<n; i++){
		System.out.println(y[i][0]);
		}
	}
}