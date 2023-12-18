package jp.ac.can;
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int A,B,C;

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0;i<num;i++){
			int[] array = new int[3];
			for (int j = 0; j<3; j++){
				array[j] = sc.nextInt();
			}
			A = array[0] * array[0];
			B = array[1] * array[1];
			C = array[2] * array[2];

			if(A == B + C){
				System.out.println("YES");
			}else if(B == A + C){
				System.out.println("YES");
			}else if(C == A + B){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}