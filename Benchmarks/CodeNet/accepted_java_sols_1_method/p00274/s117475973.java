import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10000];
		int a = sc.nextInt();
		int hoz = 1;
		int hoz2 = 0;
		int Cnt = 0;
		while(a != 0){
			for(int cnt = 0;cnt < a;cnt++){
				int b = sc.nextInt();
				if(b >= 2){
					hoz++;
				}else if(b == 1){
					hoz2++;
				}
				if(hoz >= 2){
					A[Cnt] = hoz + hoz2;
				}else{
					A[Cnt] = 101;
				}
			}
			Cnt++;
			hoz = 1;
			hoz2 = 0;
			a = sc.nextInt();
		}
		for(int n = 0; n < Cnt; n++){
			if(A[n] != 101){
				System.out.println(A[n]);
			}else{
				System.out.println("NA");
			}
		}
	}
}