import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

	while(true){

        int n = sc.nextInt();
	int i = 0;
	int[] test = new int[n];
	double[] hen = new double[n];
	double sum = 0;
	double sum2 = 0;
	double ave = 0;
	double ave2 = 0;

	if(n==0){
		break;
	}

	for(i=0; i<n; i++){
		test[i] = sc.nextInt();
	}

	for(i=0; i<n; i++){
		sum += test[i];
	}

		ave = sum / test.length;

	for(i=0; i<n; i++){
		hen[i] = (test[i] - ave)*(test[i] - ave);
		sum2 += hen[i];
	}	
		ave2 = sum2 / test.length;

		System.out.print(String.format("%.8f", Math.sqrt(ave2)));
		System.out.print("\n");
	}
    }
}
