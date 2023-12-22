import java.util.Scanner;                      

class Main {                                  
	public static void main(String[] args) {   
		Scanner scanner = new Scanner(System.in);      

		int n = scanner.nextInt();
		int[][][] a; 
		a = new int[4][3][10];    //部屋の場所を表す３次元配列の作成

		for(int i= 0;i<n;i++){
			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			a[b-1][f-1][r-1]=a[b-1][f-1][r-1]+v;//各場所に入居者の増減を入力
		}
		for(int b=0;b<4;b++){
			if(!(b == 0)){
				System.out.println("");
				for(int i=0;i<20;i++){
					System.out.print("#");
				}
				System.out.println("");
			}
			for(int f=0;f<3;f++){
				if(! (f == 0)){
					System.out.println("");
				}
				for(int r=0;r<10;r++){
					System.out.print(" "+a[b][f][r]); //10部屋の出力を階数、棟の数分繰り返し、各処理の間に改行と#を挿入
				}
			}
		}
		System.out.println("");
		scanner.close();
	}
}
