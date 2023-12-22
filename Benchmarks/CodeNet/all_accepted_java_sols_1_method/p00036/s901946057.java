import java.util.Scanner;

public class Main {

	static int[][] a;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			a = new int[30][30];
			int x=0, y=0;
			boolean flag = false;
			for(int i = 5; i < 5+8;i++){
				String str = cin.next();
				for(int j = 5; j < 5+8;j++){
					a[i][j]=str.charAt(j-5)-'0';
					if(a[i][j]==1&&!flag){
						flag=true;
						x=i;y=j;
					}
				}
			}
			// A
			if(a[x][y]+a[x][y+1]+a[x+1][y]+a[x+1][y+1]==4){
				System.out.println("A");
				continue;
			}
			
			//B
			if(a[x][y]+a[x+1][y]+a[x+2][y]+a[x+3][y]==4){
				System.out.println("B");
				continue;
			}
			
			//C
			if(a[x][y]+a[x][y+1]+a[x][y+2]+a[x][y+3]==4){
				System.out.println("C");
				continue;
			}
			
			//D
			if(a[x][y]+a[x+1][y]+a[x+1][y-1]+a[x+2][y-1]==4){
				System.out.println("D");
				continue;
			}
			
			//E
			if(a[x][y]+a[x][y+1]+a[x+1][y+1]+a[x+1][y+2]==4){
				System.out.println("E");
				continue;
			}
			
			//F
			if(a[x][y]+a[x+1][y]+a[x+1][y+1]+a[x+2][y+1]==4){
				System.out.println("F");
				continue;
			}
			
			//G
			if(a[x][y]+a[x][y+1]+a[x+1][y-1]+a[x+1][y]==4){
				System.out.println("G");
				continue;
			}
		}
	}

}