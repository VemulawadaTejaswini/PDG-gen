import java.util.Scanner;

public class Main{
	//島の数をカウントする。
	public static void main(String[] args) {
		//海図を入力する
		Scanner sc=new Scanner(System.in);
		int[][] map=new int[12][12];
		while(sc.hasNext()) {
			for(int i=0;i<12;i++) {
				String map_wide_num=sc.next();
				for(int j=0;j<12;j++) {
					map[i][j]=Integer.parseInt(map_wide_num.substring(j,j+1));
				}
			}
			//mapから島(1)を探す
			//見つけたらカウントする
			//その"1"を"2"にする
			//map全体を探し、"2"の周り(上下左右)にある"1"を全て"2"にする。
			int count=0;
			for(int i=0;i<12;i++) {
				for(int j=0;j<12;j++) {
					if(map[i][j]==1) {
						count++;
						map[i][j]=2;
					}
					for(int k=0;k<12;k++) {
						for(int l=0;l<12;l++) {
							if(map[k][l]==2) {
								if(k==0) {
								}else if(map[k-1][l]==1) {//top
									map[k-1][l]=2;
								}
								if(k==11) {
								}else if(map[k+1][l]==1) {//down
									map[k+1][l]=2;
								}
								if(l==11) {
								}else if(map[k][l+1]==1) {//left
									map[k][l+1]=2;
								}
								if(l==0) {
								}else if(map[k][l-1]==1) {//right
									map[k][l-1]=2;
								}
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}

