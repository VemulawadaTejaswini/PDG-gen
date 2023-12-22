import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] A_ = new int[N+2];
	int[] B_ = new int[N+1];
	int[] M_ = new int[N];
	
	A_[0] = A_[N+1] = 0;

	for(int i = 1; i < N+1; i++){
	    A_[i] = scan.nextInt();
	}

	//N個すべてのスポットを回った場合の金額
	int sum = 0;
	for(int i = 0; i < N+1; i++){
	    sum += Math.abs(A_[i+1]-A_[i]);
	}

	//i個の場合についてsumから差分を引いていく
	for(int i = 1; i < N+1; i++){
	    M_[i-1] = (Math.abs(A_[i+1]-A_[i])+Math.abs(A_[i]-A_[i-1]))
		-(Math.abs(A_[i+1]-A_[i-1]));
	    System.out.println(sum-M_[i-1]);
	}
    }
}
