import java.util.Scanner;

class q0510 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[4];
		int[] b = new int[4];
		
		int sumA = 0, sumB = 0;
		
		for(int i = 0; i < 4; i++){
			a[i] = in.nextInt();
			sumA += a[i];
		}
		
		for(int i = 0; i < 4; i++){
			b[i] = in.nextInt();
			sumB += b[i];
		}
		
		if(sumA < sumB){
			System.out.println(sumB);
		}
		else{
			System.out.println(sumA);
		}
		
	}
}