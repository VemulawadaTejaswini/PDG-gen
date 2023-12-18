import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[150][150];
		for(int j=0;j<150;++j){
			for(int i=0;i<150;++i){
				if(j<i) map[j][i]=(i+1)*(i+1)+(j+1)*(j+1);
				else map[j][i]=-1;
			}
		}
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			int max=50000,x=0,y=0;
			if(h==0&&w==0) break;
			for(int j=149;j>=0;--j){
				for(int i=149;i>=0;--i){
					if(!(j==h-1&&i==w-1)){
						if(map[h-1][w-1]<=map[j][i]&&map[j][i]<=max){
							if(map[h-1][w-1]==map[j][i]&&map[j][i]<=max){
								if(h-1<j){
									max=map[j][i];
									x=i+1;
									y=j+1;
								}
							} else {
								if(!(map[j][i]==max&&y<j)){
									max=map[j][i];
									x=i+1;
									y=j+1;
								}
							}
						}
					}
				}
			}
			System.out.println(y+" "+x);
		}
	}
}

