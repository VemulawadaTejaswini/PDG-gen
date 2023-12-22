import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[] A = new int[N];//生徒配列
			int[] jun= new int[N];//junban配列1,2,3,4,5番号
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				jun[A[i]-1]=i+1;
			}
			
			
			for(int i =0;i<N;i++) {
			System.out.print(jun[i]);
			System.out.print(" ");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
