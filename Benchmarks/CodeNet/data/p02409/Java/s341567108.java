import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[][][] apart = new int[4][3][10];
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			int b = Integer.parseInt(in.next());
			int f = Integer.parseInt(in.next());
			int r = Integer.parseInt(in.next());
			int v = Integer.parseInt(in.next());
			apart[b-1][f-1][r-1] = 	apart[b-1][f-1][r-1] + v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					if(k == 9) System.out.println(" "+apart[i][j][k]);
				    else  System.out.print(" "+apart[i][j][k]);
				} 
				if(j==2 && i!=3) System.out.println("####################");
			}
		}
	}	
}