import java.util.Scanner;

public class Main {
	static int c[][]=new int[8][8];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		for(int j = 0; j<i;j++){
			for(int l=0;l<8;l++){
				String s=sc.next();
				for(int p=0;p<8;p++){
					c[p][l]=s.charAt(p)-48;
				}
			}
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			bom(x,y);
			
			System.out.println("Data "+(j+1)+":");
			for(int l=0;l<8;l++){
				for(int p=0;p<8;p++){
					System.out.print(c[p][l]);
				}
				System.out.println();
			}
		}
	}
	
	public static void bom(int x,int y){
		c[x][y]=0;
		for(int i=0;i<7;i++){
			if((x-3+i)<0 || (x-3+i)>7)continue;
			if(c[x-3+i][y]==1)bom(x-3+i,y);
		}
		for(int i=0;i<7;i++){
			if((y-3+i)<0 || (y-3+i)>7)continue;
			if(c[x][y-3+i]==1)bom(x,y-3+i);
		}
	}

}