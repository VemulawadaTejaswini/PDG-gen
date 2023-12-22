import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int ma[][]=new int[3][10];
		int mb[][]=new int[3][10];
		int mc[][]=new int[3][10];
		int md[][]=new int[3][10];
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				ma[i][j]=0;
				mb[i][j]=0;
				mc[i][j]=0;
				md[i][j]=0;
			}
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int b=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			int v=sc.nextInt();
			switch(b){
			case 1:
				ma[f-1][r-1]+=v;
				break;
			case 2:
				mb[f-1][r-1]+=v;
				break;
			case 3:
				mc[f-1][r-1]+=v;
				break;
			case 4:
				md[f-1][r-1]+=v;
				break;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+ma[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+mb[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+mc[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+md[i][j]);
			}
			System.out.println();
		}
	}
}