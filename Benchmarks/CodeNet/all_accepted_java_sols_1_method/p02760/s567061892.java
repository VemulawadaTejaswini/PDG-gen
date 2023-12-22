//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		boolean ok[][] = new boolean [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ok[i][j] = true;
				//System.out.println(ok[i][j]);
			}
		}
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(n == A[j][k]) {
						ok[j][k] = false;
					}
				}
			}
		}
		boolean hantei = false;
		for(int i=0;i<3;i++) {
			if(!ok[i][0]&&!ok[i][1]&&!ok[i][2]) {
				hantei = true;
			}
		}
		for(int j=0;j<3;j++) {
			if(!ok[0][j]&&!ok[1][j]&&!ok[2][j]) {
				hantei = true;
			}
		}
		if(!ok[0][0]&&!ok[1][1]&&!ok[2][2]) {
			hantei = true;
		}
		if(!ok[2][0]&&!ok[1][1]&&!ok[0][2]){
			hantei = true;
		}
		if(hantei) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}