import java.util.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int c[][] = new int[3][3];

		for(int i= 0;i<3;i++){
			for(int j = 0; j<3; j++){
				c[i][j] = sc.nextInt();
			}
		}
		
		int w = 0;
		
		int a[] = new int[3];
		int b[] = new int[3];

		for(w = 0;w<=100;w++){
	
			a[0] = w;
			b[0] = c[0][0] - a[0];
			b[1] = c[0][1] - a[0];
			b[2] = c[0][2] - a[0];

			for(int i=0;i<3;i++){
				if(b[i] < 0){
					System.out.println("No");
					return;
				}
			}
			
			int aa[][] = new int[3][3];

			for(int i = 1;i<3;i++){
				for(int j=0;j<3;j++){
					aa[i][j] = c[i][j] - b[j];
				}
			}

			if(aa[1][0] != aa[1][1] || aa[1][0] != aa[1][2] || aa[2][0] != aa[2][1] || aa[2][0] != aa[2][2]){
				continue;
			}
			
		System.out.println("Yes");
		return;
		}
			System.out.println("No");	
	}
}


