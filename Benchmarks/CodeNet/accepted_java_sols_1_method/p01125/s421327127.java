import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[21][21];
			int x, y;
			for(int i=0;i<n;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				map[y][x]++;
			}
			int m = sc.nextInt();
			x = 10;
			y = 10;
			for(int i=0;i<m;i++){
				String s = sc.next();
				int len = sc.nextInt();
				if(s.compareTo("N")==0){
					for(int j=0;j<=len;j++){
						map[y+j][x]--;
					}
					y += len;
				}
				if(s.compareTo("S")==0){
					for(int j=0;j<=len;j++){
						map[y-j][x]--;
					}
					y -= len;
					
				}
				if(s.compareTo("E")==0){
					for(int j=0;j<=len;j++){
						map[y][x+j]--;
					}
					x += len;
				}
				if(s.compareTo("W")==0){
					for(int j=0;j<=len;j++){
						map[y][x-j]--;
					}
					x -= len;
				}
			}
			boolean exit = true;
			for(int i=0;i<21;i++){
				for(int j=0;j<21;j++){
					if(map[i][j]>0){
						exit=false;
						i=21;
						j=21;
					}
				}
			}
			if(exit==true){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
						
		}

	}
}