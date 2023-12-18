
import java.util.Scanner;

public class ALDS_1_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N =sc.nextInt();
		int [] A = new int[N];
		String[]str = sc.nextLine().split(" ");
		for(int i=1 ; i < str.length; i++  ){
			A[i] = Integer.parseInt(str[i]);
		}
		show(A);
		for(int i =1; i < N ; i++){
			int v = A[i];
			int j = i-1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j --;
			}
			A[j+1] = v;
			show(A)	;
			}	
	}
	public static void show(int[] A){
		String op = "";
		for (int i = 0 ; i < A.length; i++){
			op += A[i];
			if(i != A.length -1){
				op += " ";
			}
		}
		System.out.println(op); 
	}
	
}