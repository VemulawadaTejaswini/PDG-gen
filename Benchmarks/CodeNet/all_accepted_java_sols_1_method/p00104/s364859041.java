import java.util.Scanner;

public class Main {

	static int UP=1,DOWN=3,RIGHT=2,LEFT=4;
	static int[] v1 = {0,-1, 0, 1, 0};
	static int[] v2 = {0,0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int h=cin.nextInt();
			int w=cin.nextInt();
			if(h+w==0){
				break;
			}
			int[][] a = new int[h][w];
			String[] s = new String[h];
			for(int i =0;i < h;i++){
				s[i]=cin.next();
				char[] c = s[i].toCharArray();
				for(int j = 0;j <w;j++){
					if(c[j]=='^'){
						a[i][j]=UP;
					}
					else if(c[j]=='>'){
						a[i][j]=RIGHT;
					}
					else if(c[j]=='v'){
						a[i][j]=DOWN;
					}
					else if(c[j]=='<'){
						a[i][j]=LEFT;
					}
					else{
						a[i][j]=0;
					}
				}
			}
			int x=0,y=0;
			while(true){
				if(a[x][y]==0){
					System.out.println(y+" " +x);
					break;
				}
				else if(a[x][y]==-1){
					System.out.println("LOOP");
					break;
					// LOOP
				}
				int c = a[x][y];
				a[x][y]=-1;
				x+=v1[c];
				y+=v2[c];
				
			}
		}
	}

}