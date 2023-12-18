import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h=sc.nextInt();
			if(h==0) break;
			
			int[][] map = new int[h][5];
			for(int j=0;j<h;++j) {
				for(int i=0;i<5;++i) {
					map[j][i] = sc.nextInt();
				}
			}
			score=0;
			
			while(true) {
				int cs = check(h,map);
				if(cs==0) {
					System.out.println(score);
					break;
				}
				score+=cs;
				map=down(h,map);
			}
		}
		
	}
	
	public static int check(int h, int[][] map) {
		int len,score=0;
		for(int j=0;j<h;++j) {
			for(int i=0;i<=2;++i) {
				for(len=1;len+i<=4;++len) {
					if(map[j][i] != map[j][i+len]) break;
				}
				if(len<=2) continue;
				score += map[j][i]*len;
				for(int z=0;z<len;++z) {
					map[j][i+z]=0;
				}
			}
		}
		return score;
	}
	
	public static int[][] down(int h, int[][] map) {
		for(int i=0;i<5;++i) {
			for(int min=1;min<h;++min) {
				for(int j=h-1;j>=min;--j) {
					if(map[j][i]==0) {
						map[j][i]=map[j-1][i];
						map[j-1][i]=0;
					}
				}
			}
		}
		return map;
	}
}

