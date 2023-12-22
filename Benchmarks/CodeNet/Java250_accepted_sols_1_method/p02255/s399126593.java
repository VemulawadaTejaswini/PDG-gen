import java.util.Scanner;

class Main{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//??????????????????
		
		int [] intAry = new int[N];
		
		for( int i = 0 ; i < intAry.length ; i++){
			intAry[i] = sc.nextInt();
		}
		
		for( int i = 0 ; i < intAry.length ; i++){
			
			if( i == 0){
				System.out.print(intAry[i]);
			}else{
				System.out.print(" " + intAry[i]);
			}
		}
		
		System.out.println();
		
		for (int i = 1; i < intAry.length; i++) {
			int j = i;
			while(j > 0 && intAry[j-1] > intAry[j]){
				int temp = intAry[j];
				intAry[j] = intAry[j-1];
				intAry[j-1] = temp;
				j--;
			}
			for( int x = 0 ; x < N ; x++ ){
				if( x == 0){
					System.out.print(intAry[x]);
				}else{
					System.out.print(" " + intAry[x]);
				}
			}
			System.out.println();
		}
	}
}