import java.util.*;
public class Atcoder4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int count_Bl=0;
		int result=0;
		int[][] board =new int[h][w];
		
		for(int i=0;i<h;i++){
			String input=sc.next();
			for(int j=0;j<w;j++){
				if(input.charAt(j)=='#'){
					board[i][j] = 1;
				}else{
					board[i][j] = 0;
				}

			}
		}  
		for(int i=0;i<Math.pow(2,h);i++){
			String paH=String.format("%6s",Integer.toBinaryString(i));
			for(int j=0;j<Math.pow(2,w);j++){
				String paW=String.format("%6s",Integer.toBinaryString(j));

				for(int n=0;n<h;n++){
					for(int m=0;m<w;m++){
						if(paH.charAt(6-h+n)!='1' && paW.charAt(6-w+m)!='1'){
							if(board[n][m]==1){
								count_Bl+=1;
							}
						}
					}   
				}
				if(count_Bl==k){
					result+=1;
				}
				count_Bl=0;
			} 
		}
		System.out.println(result);
	} 
}