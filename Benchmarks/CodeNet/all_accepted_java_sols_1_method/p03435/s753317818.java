import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				c[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=1; j<3; j++){
				c[i][j] -= c[i][0];
			}
		}
		System.out.println(c[0][1]==c[1][1] && c[1][1]==c[2][1] && c[0][2]==c[1][2] && c[1][2]==c[2][2] ? "Yes" : "No");
	}
}