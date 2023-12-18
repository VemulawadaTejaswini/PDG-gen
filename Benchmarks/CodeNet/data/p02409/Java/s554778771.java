import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//４棟それぞれ別に配列を設ない（）
		int[][][]house = new int[4][3][10];
		//データ入力数をnとする。
		int n = sc.nextInt();
		//データ入力数n回分forを回す(　˙-˙　)
		for(int i=0;i<n;i++) {
			int b = sc.nextInt();//棟番号
			int f = sc.nextInt();//階数
			int r = sc.nextInt();//部屋番号
			int v = sc.nextInt();//人数
			//？？
			house [b-1][f-1][r-1] += v;
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					System.out.print(" "+house[i][j][k]);
				}
				System.out.println();
                                }
				if(i!=3) {
					System.out.println("####################");
				
			}
		}
	}
}


