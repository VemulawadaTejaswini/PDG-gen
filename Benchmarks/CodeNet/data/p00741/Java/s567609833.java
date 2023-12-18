import java.util.Scanner;

public class Main {
	static int w,h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			if(w==0&&h==0) break;
			int[][] map = new int[h+2][w+2];
			for(int j=1;j<=h;++j){
				for(int i=1;i<=w;++i){
					map[j][i]=sc.nextInt();
				}
			}
			int count=0;
			for(int j=1;j<=h;++j){
				for(int i=1;i<=w;++i){
					if(map[j][i]==1){
						map[j][i]=0;
						mapping(map,i,j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void mapping(int[][]map,int i,int j){
		for(int m=-1;m<=1;++m){
			for(int n=-1;n<=1;++n){
				if(map[j-m][i-n]==1){
					map[j-m][i-n]=0;
					mapping(map,i-n,j-m);
				}
			}
		}
	}
}
