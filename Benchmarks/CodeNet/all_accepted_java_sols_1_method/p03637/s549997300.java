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

	int four = 0;
	int two = 0;
	int nn = 0;
	for(int i = 0 ; i < N ; i++){
		if(A[i]%4 == 0){
			four++;
		}
		else if(A[i]%2 == 0 && A[i]%4 !=0){
			two++;
		}
		else{
			nn++;
		}
	}
	if(four >= nn ||(nn-1 == four && two ==0)){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}

	}
}
