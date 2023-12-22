import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int T = scan.nextInt();
	int A = scan.nextInt();

	int[] H_ = new int[N];
	for(int i = 0; i < N; i++){
	    H_[i] = scan.nextInt();
	}

	double min_diff = 10000;
	int point = 0;

	for(int i = 0; i < N; i++){
	    double temp = T - H_[i]*0.006;
	    if(Math.abs(A-temp) < min_diff){
		min_diff = Math.abs(A-temp);
		point = i;
	    }
	}

	System.out.println(point+1);
    }
}
