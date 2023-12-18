import java.util.Scanner;

public class Main {

	static int n,m,a;
	static int[][] field;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			m=cin.nextInt();
			a=cin.nextInt();
			if(n+m+a==0){
				break;
			}
			field=new int[n+2][1020];
			int max=0;
			for(int i = 0;i<m;i++){
				int x = cin.nextInt();
				int y = cin.nextInt();
				int z = cin.nextInt();
				field[y][x]=field[z][x]=i+1;
				max=Math.max(x,max);
			}
			
			/*
			for(int i = 1;i<max+2;i++){
				for(int j = 1;j<n+1;j++){
					System.out.print(field[j][i]+  " ");
					
				}
				System.out.println();
			}
			*/
			for(int i = max+1;i>=1;i--){
				if(field[a][i]>0){
					if(field[a-1][i]==field[a][i]){
						a--;
					}
					else{
						a++;
					}
				}
			}
			System.out.println(a);
		}

	}

}