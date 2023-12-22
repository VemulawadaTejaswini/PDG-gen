import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int a = 0;
		String C[] = new String[H];
		//int C[][] = new int[H][W];
		for(int i=0;i<H;i++){
			C[i] = sc.next();
		}
		/*for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					C[i][j] = sc.nextInt();
				}
			}*/
		for(int i=0;i<H;i++){
			System.out.println(C[i]);
			System.out.println(C[i]);
		}
	}
}