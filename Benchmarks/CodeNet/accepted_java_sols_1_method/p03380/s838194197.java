import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();

	int[] A = new int[N];

	for(int i = 0 ; i < N ; i++){
		A[i] = sc.nextInt();
	}
	sc.close();


	Arrays.sort(A);

	int p = 0;
	if(A[N-1]%2 == 1){
		p = (A[N-1]/2)+1;
	}
	else{
		p = (A[N-1]/2);
	}

	int min = 1000000000;
	int aa = 0;
	for(int i = 0 ; i < N ; i++){
		if(min > Math.abs(p-A[i])){
			min = Math.abs(p-A[i]);
			aa = i;
		}
	}
	System.out.println(A[N-1] + " " + A[aa]);
	}
}
