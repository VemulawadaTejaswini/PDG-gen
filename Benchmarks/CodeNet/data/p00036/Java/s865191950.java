import java.util.Scanner;
public class Main {
	public static void ans(int bord[][]){
		int i,j;
		for(j=0;j<8;j++){
			for(i=0;i<8;i++){
				if(bord[i][j]==1){
					if(bord[i+1][j]==1 && bord[i][j+1]==1 && bord[i+1][j+1]==1){
						System.out.println("A");return;
					}
					if(bord[i][j+1]==1 && bord[i][j+2]==1 && bord[i][j+3]==1){
						System.out.println("B");return;
					}
					if(bord[i+1][j]==1 && bord[i+2][j]==1 && bord[i+3][j]==1){
						System.out.println("C");return;
					}
					if(bord[i][j+1]==1 && bord[i-1][j+1]==1 && bord[i-1][j+2]==1){
						System.out.println("D");return;
					}
					if(bord[i+1][j]==1 && bord[i+1][j+1]==1 && bord[i+2][j+1]==1){
						System.out.println("E");return;
					}
					if(bord[i][j+1]==1 && bord[i+1][j+1]==1 && bord[i+1][j+2]==1){
						System.out.println("F");return;
					}
					if(bord[i+1][j]==1 && bord[i][j+1]==1 && bord[i-1][j+1]==1){
						System.out.println("G");return;
					}
				}
			}//for
		}//for
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bord[][]=new int[8][8],x,y,i,j;
		char ch[]=new char[8];
		while(sc.hasNext()){
			for(j=0;j<8;j++){
				String str=sc.next();
				ch=str.toCharArray();
				for(i=0;i<8;i++)
					bord[i][j]=ch[i]-'0';
			}
			ans(bord);
		}
	}
}