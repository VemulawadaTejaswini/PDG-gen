import java.util.*;
public class Paipu{
	public static void main(String[] args){
		int n = 0, p = 0, j = 0, x = 0, y = 0;
		int psum = 0,jmax = 0, kei = 0, kei2 = 0;
		int a, b;
		int[][] hairetu = new int[2][65000];
		Scanner scan = new Scanner(System.in);
		while( true ){
			psum = 0;
			jmax = 0;
			System.out.println("パイプの本数を入力");
			n = scan.nextInt();
			if(n == 0) break;
			x = n;
			y = n;
			for(a = 0; a < x; a++){
				System.out.println("パイプの長さを入力");
				p = scan.nextInt();
				hairetu[0][a] = p;
				psum += p;
			}
			for(b = 0; b < y - 1; b++){
				System.out.println("ジョイントの長さを入力");
				j = scan.nextInt();
				hairetu[1][b] = j;
				if(j > jmax){
					jmax = j;
				}
			}
			kei = psum * n;
			kei2 = (psum + jmax) * (n - 1);
			if(kei > kei2){
				System.out.println(kei);
			}
			else{
				System.out.println(kei2);
			}
		}
	}
}
			