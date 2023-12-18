import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean map[][]=new boolean[21][21];
		while(true){
			int n=sc.nextInt();
			if(n == 0) break;
			for(int i=0; i<n; i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				map[y][x]=true;
			}
			int m=sc.nextInt();
			int nx,ny;
			nx=ny=10;
			for(int i=0; i<m; i++){
				
				String dir=sc.next();//direction
				int move=sc.nextInt();
				//ここから移動処理。どうやら入力で範囲をはみ出ることはないらしいが、一応そこのチェックを書いておいた。
				//途中でめんどくさくなってmoveの範囲外の処理は書かなかった。
				//処理順が気持ち悪いのは方角と方向の対応を勘違いしてたため。
				if(dir.equals("S")){
					for(int j=0; j<=move; j++){
						if(0 <= ny-j){
							map[ny-j][nx]=false;
						}
					}
					ny-=move;
				}
				else if(dir.equals("E")){
					for(int j=0; j<=move; j++){
						if(nx+j < 21){
							map[ny][nx+j]=false;
						}
					}
					nx+=move;
				}
				else if(dir.equals("N")){
					for(int j=0; j<=move; j++){
						if(ny+j < 21){
							map[ny+j][nx]=false;
						}
					}
					ny+=move;
				}
				else if(dir.equals("W")){
					for(int j=0; j<=move; j++){
						if(0 <= nx-j){
							map[ny][nx-j]=false;
						}
					}
					nx-=move;
				}
//				System.out.println("ny="+ny+" nx="+nx);
			}
			//complet check
			boolean f=false;;
			for(int i=0; i<21; i++){
				for(int j=0; j<21; j++){
					if(map[i][j]){
						f=true;
						break;
					}
				}
			}
			if(f) System.out.println("No");
			else System.out.println("Yes");
		}

	}

}