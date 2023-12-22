import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i=0; i<h; i++){
			s[i] = sc.next();
		}
		char[][] a = new char[h+2][w+2];
		for(int i=1; i<=h; i++){
			for(int j=1; j<=w; j++){
				a[i][j] = s[i-1].charAt(j-1);
			}
		}
		for(int i=0; i<h+2; i++){
			a[i][0] = '#';
			a[i][w+1] = '#';
		}
		for(int i=0; i<w+2; i++){
			a[0][i] = '#';
			a[h+1][i] = '#';
		}
		for(int i=0; i<h+2; i++){
			for(int j=0; j<w+2; j++){
				System.out.print(a[i][j]);
			}
		System.out.println("");
		}
	}
}