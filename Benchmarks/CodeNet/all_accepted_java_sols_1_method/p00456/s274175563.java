import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int[] pw = new int[10];
		int[] pk = new int[10];
		for(int i = 0; i < 10; i++){
			pw[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 10; i++){
			pk[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < 3; i++){
			int maxW = i;
			int maxK = i;
			for(int j = i+1; j <10; j++){
				if( pw[j] > pw[maxW] ){
					maxW = j;
				}
				if( pk[j] > pk[maxK] ){
					maxK = j;
				}
			}
			int tempW = pw[maxW];
			pw[maxW] = pw[i];
			pw[i] = tempW;
			int tempK = pk[maxK];
			pk[maxK] = pk[i];
			pk[i] = tempK;
		}
		
		int sumW = 0;
		int sumK = 0;
		for(int i = 0; i < 3; i++){
			sumW += pw[i];
			sumK += pk[i];
		}
		System.out.println(sumW + " " + sumK);
	}
}