
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String spell = s.next();//元となる文字
		char[] Narray = new char[spell.length()];
		for(int i=0; i<spell.length(); i++){
			Narray[i] = spell.charAt(i);
		}
		String[] board = new String[N];
		for(int i=0; i<N; i++){
			board[i] = s.next();
		}

		int[][][] test = new int[N][spell.length()][100];
		char check;
		for(int k=0; k<N; k++){
		for(int i=0; i<spell.length(); i++){
			for(int j=0; j<board[k].length(); j++){
				check = board[k].charAt(j);
				if(Narray[i]==check){
					test[k][i][j] = j+1;
				}else{
					test[k][i][j] = 0;
				}
			}
		}
		}
		int comp = 0;
		for(int k=0; k<N; k++){
		for(int i=0; i<spell.length(); i++){
			for(int j=i+1; j<100; j++){
				if(test[k][0][i]!=0 && test[k][1][j]!=0){
					int count = 0;
					if(test[k][0][0]==1){
						count = test[k][1][j]-test[k][0][i];
					}else{
						count = test[k][1][j]-test[k][0][i]-1;
					}
					int flag = 2;
					for(int a=2; a<3; a++){
						for(int b=j+count; b<100; b+=count){
							if(test[k][a][b]==0) continue;
								//System.out.println(a+" "+b);
								flag++;
								if(flag==spell.length()){
									comp++;
								}
						}
					}
				}
			}
		}
		}
		System.out.println(comp);
		/*for(int k=0; k<N; k++){
		for(int i=0; i<Narray.length; i++){
			for(int j=0; j<25; j++){
				System.out.print(test[k][i][j]+" "+" ");
			}
			System.out.println();
		}
		System.out.println();
		}*/
	}
}