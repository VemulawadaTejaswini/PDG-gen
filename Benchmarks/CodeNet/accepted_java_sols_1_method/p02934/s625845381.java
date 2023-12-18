import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	double sum = 0;

	double[] A = new double[N];

	for(int i=0; i<N; i++){

	A[i] = sc.nextInt();

  }

	for(int i=0; i<N; i++){

	sum += 1/A[i];		

  }

	System.out.println(1/sum);
 }
}