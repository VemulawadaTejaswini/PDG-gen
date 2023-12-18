import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c[][]=new int[4][2];
		while(sc.hasNext()){
			double r=sc.nextDouble();
			double l=sc.nextDouble();
			if(r>=1.1){
				c[0][0]++;
			}
			else if(r>=0.6){
				c[1][0]++;
			}
			else if(r>=0.2){
				c[2][0]++;
			}
			else{
				c[3][0]++;
			}
			
			if(l>=1.1){
				c[0][1]++;
			}
			else if(l>=0.6){
				c[1][1]++;
			}
			else if(l>=0.2){
				c[2][1]++;
			}
			else{
				c[3][1]++;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
				if(j==1) System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}