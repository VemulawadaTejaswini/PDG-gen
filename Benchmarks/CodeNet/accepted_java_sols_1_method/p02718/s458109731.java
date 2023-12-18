import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	System.out.println();
	int[] A = new int[N];
	int total = 0;
	for(int i = 0; i < N; i++){
	    A[i] = sc.nextInt();
	    total += A[i];
	}

	int L = 0;
	for(int i = 0; i < N; i++){
	    int comp = A[i]*4*M;
	    if(total <= comp){
		L++;
	    }
	}

	String ans = "No";
	if(M <= L){
	    ans = "Yes";
	}

	System.out.println(ans);

    }
}
