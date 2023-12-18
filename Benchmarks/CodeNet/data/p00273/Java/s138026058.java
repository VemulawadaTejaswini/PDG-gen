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
			
			if(Nm >= 5 && Pm >= 2){
				A[n] = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
			}else if(Nm >= 5 && Pm >=0){
				Pm = 2;
				A[n] = (Nr * Nm / 10 * 8) + (Pr * Pm / 10 * 8);
			}else{
				A[n] = Nr * Nm + Pr * Pm;
			}
		}
		for(int i = 0; i < Ni; i++){
			System.out.println(A[i]);
		}
	}
}