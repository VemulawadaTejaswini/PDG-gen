import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  numA = scanner.nextInt();//要素数
		int arrayA[] = new int[numA];
		
		for(int i = 0; i < numA; i ++ ){
			arrayA[i] = scanner.nextInt();
		}
		
		int  numM = scanner.nextInt();//要素数
		int arrayM[] = new int[numM];
		
		for(int i = 0; i < numM; i ++ ){
			arrayM[i] = scanner.nextInt();
		}
		
		Recursive(numA, arrayA, numM, arrayM);
		
		scanner.close();
	}
	
	public static void Recursive(int numA, int[] arrayA, int numM, int[] arrayM){ 
		
		for(int cou = 0; cou < numM; cou ++ ){
			if ( Recursive(numA, arrayA, 0, arrayM[cou]) ){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		
	}
	
	public static boolean Recursive(int numA, int[] arrayA, int i, int m){ 
		if( m == 0){
			return true;
		}
		
		if (i >= numA){
			return false;
		}
		
		return ( Recursive(numA,arrayA, i + 1, m)|| 
				Recursive(numA,arrayA,i + 1, m - arrayA[i]) );		//再帰
	
	}
}
