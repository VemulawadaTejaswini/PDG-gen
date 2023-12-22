import java.util.Scanner;

class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A[] = new int[N];
	for(int i = 0;i < N;i++){
	    A[i] = sc.nextInt();
	}
	int flag = 1;
	int tmp, time = 0;
	while(flag == 1){
	    flag = 0;
	    for(int j = N - 1;j >= 1;j--){
		if(A[j] < A[j - 1]){
		    tmp = A[j];
		    A[j] = A[j - 1];
		    A[j - 1] = tmp;
		    time++;
		    flag = 1;
		 }
	    }
	}
	for(int k = 0;k < N;k++){
	    System.out.print(A[k]);
	    if(k == N - 1) break;
	    System.out.print(" ");
	}
	System.out.println("\n" + time);
    }
}

