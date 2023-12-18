























import java.util.Scanner;
public class Main{
	static int base[][];
	static int h,w;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),In=1;
		while(N-->0){
			String temp= sc.nextLine(), temp2 = sc.nextLine();
			base=new int[9][9];

			for(int i = 1;i <= 8; i++){
				String str = sc.next();
				for(int j = 0;j <= 7; j++ ){
					if(str.charAt(j) == '0')base[i][j+1]=0;
					else base[i][j+1]=1;
				}
			}
			w = sc.nextInt();
			h = sc.nextInt();
			don(h,w);
			System.out.println("Data "+In+++":");
			for(int i = 1;i < 9; i++){
				for(int j = 1; j < 9; j++)
					System.out.print(base[i][j]);
				System.out.println();
			}   
		}
	}
	static void don(int h,int w){
		base[h][w] = 0;
		for(int i = 1;i <= 3; i++){
			
			if(h - i >= 1 & base[h - i][w] == 1)don(h - i,w);
			if(w - i >= 1 & base[h][w - i] == 1)don(h,w - i);
			if(h + i  < 9 & base[h + i ][w] == 1)don(h + i,w);
			if(w + i < 9 & base[h][w + i] == 1)don(h,w + i);
		}
	}
}