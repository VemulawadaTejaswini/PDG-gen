import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int Ni =sc.nextInt();
		int[] A = new int[Ni];
		for(int n = 0;n < Ni; n++){
			int Nr = sc.nextInt();
			int Pr = sc.nextInt();
			int Nm = sc.nextInt();
			int Pm = sc.nextInt();
			int a = 0;
			
			if(Nm >= 5 && Pm >= 2){
				A[n] = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
				a = A[n];
			}else if(Nm >= 5 && Pm >= 0){
				A[n] = Nr * Nm + Pr * Pm;
				Pm = 2;
				a = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
			}else if(Nm >= 0 && Pm >= 2){
				A[n] = Nr * Nm + Pr * Pm;
				Nm = 5;
				a = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
			}else if(Nm <= 5 && Pm <= 2){
				A[n] = Nr * Nm + Pr * Pm;
				Nm = 5;
				Pm = 2;
				a = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
			}
			if(a < A[n] ){
		 		A[n] = a;
			}
		}
		for(int i = 0; i < Ni; i++){
			System.out.println(A[i]);
		}
	}
}