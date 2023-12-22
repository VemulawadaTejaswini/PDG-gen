import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		int[][] data = {{1,11},{5,3}};
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int[] cost = new int[6];
		cost[0] =Math.abs(A - B)+Math.abs(C - B); 
		cost[1] =Math.abs(A - C)+Math.abs(C - B);  
		cost[2] =Math.abs(B - A)+Math.abs(A - C);  
		cost[3] =Math.abs(B - C)+Math.abs(C - A);  
		cost[4] =Math.abs(C - A)+Math.abs(A - B);  
		cost[5] =Math.abs(C - B)+Math.abs(B - A);  

		for(int i= 0;i < 6;i++){
			min = Math.min(min, cost[i]);
		}
		System.out.println(min);





		//		String S = scan.next();

		//		int[] data = new int[N];
		//		for(int i= 0; i < N ;i++){
		//			data[i] = scan.nextInt();
		//		}
		//
		//		int[][] mat = new int[N][N];
		//		int[][] xor = new int[N][N];
		//
		//		for(int i = 0;i < N;i++){
		//			mat[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				mat[i][j+1] = mat[i][j]+ data[j+1];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//		
		//
		//		for(int i = 0;i < N;i++){
		//			xor[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				xor[i][j+1] +=xor[i][j] ^ data[j];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//
		//		int count = 0;
		//		for(int i= 0;i < N;i++){
		//			for(int j = i;j < N;j++){
		//				if(xor[i][j] == mat[i][j]&&mat[i][j] != 0 ){
		//					count++;
		//				}
		//			}
		//		}
		//		System.out.println(count);
		//
		//


	}
}






