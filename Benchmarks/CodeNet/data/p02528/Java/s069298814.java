import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] val = new int[n];
		for( int i = 0; i < n; i++ ){
			val[i] = Integer.parseInt(scan.next());
		}
		for( int i = 0; i < n; i++ ){
			for( int j = 0; j < n - 1; j++ ){
				int count = 0;	//??\?????????????????°???
				if( val[j] > val[j+1] ){
					int temp = val[j];
					val[j] = val[j+1];
					val[j+1] = temp;
					count++;
				}
			}
			if( count == 0 ){
				//for???????????????
				i = n;
				j = n;
			}
		}
		
		System.out.print(val[0]);
		for( int i = 1; i < n; i++ ){
			System.out.print(" " + val[i]);
		}
		System.out.println();
		return;
	}
}