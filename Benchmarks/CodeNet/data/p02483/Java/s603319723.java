import java.util.Scanner;

public class Main{
	public static void Swap(int[] t){
		int temp = t[0];
		t[0] = t[1];
		t[1] = temp;
		return;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = 3;
		int[] val = new int[n];
		for( int i = 0; i < n; i++ ){
			val[i] = Integer.parseInt(scan.next());
		}
		
		
		for( int i = 0; i < n; i++ ){
			for( int j = 0; j < n-1; j++ ){
				if( val[j] > val[j+1] ){
					int tSwap[] = new int[2];
					tSwap[0] = val[j];
					tSwap[1] = val[j+1];
					Swap(tSwap);
					val[j] = tSwap[0];
					val[j+1] = tSwap[1];
				}
			}
		}
		

		System.out.print(val[0]);

		for( int i = 1; i < n; i++ ){
			System.out.printf(" %d", val[i]);
		}

		return;
	}
}