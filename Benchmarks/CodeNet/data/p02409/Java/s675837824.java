import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, k;
		int floor1[][];
		int floor2[][];
		int floor3[][];
		int floor4[][];
		floor1 = new int[3][10];
		floor2 = new int[3][10];
		floor3 = new int[3][10];
		floor4 = new int[3][10];
		
		int n = scan.nextInt();
		int v;
		int w;
		
	
	
		for (k = 1; k <= n; k++) {
			
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			v = scan.nextInt();
			w = v;
		
if(b == 1 && v <= 9 && floor1[f-1][r-1] >= 0){
	floor1[f-1][r-1] += v;
}else if(b == 2 &&  v <= 9 && floor2[f-1][r-1] >= 0){
	floor2[f-1][r-1] += v;
}else if(b == 3 &&  v <= 9 && floor3[f-1][r-1] >= 0){
	floor3[f-1][r-1] += v;
}else if(b == 4 &&  v <= 9 && floor4[f-1][r-1] >= 0){
	floor4[f-1][r-1] += v;
}


		}
		
			
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 10; i++) {
				
				System.out.print(" "+floor1[j][i]);
				if(i >= 9){
					System.out.println();
				}
				
			}
		}
		System.out.println("####################");
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 10; i++) {
				System.out.print(" "+floor2[j][i]);
				if(i >= 9){
					System.out.println();
				}
				
			}
		}
		System.out.println("####################");
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 10; i++) {
				System.out.print(" "+floor3[j][i]);
				if(i >= 9){
					System.out.println();
				}
				
			}
		}
		System.out.println("####################");
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 10; i++) {
				System.out.print(" "+floor4[j][i]);
				if(i >= 9){
					System.out.println();
				}
				
			}
		}
	}
		

}