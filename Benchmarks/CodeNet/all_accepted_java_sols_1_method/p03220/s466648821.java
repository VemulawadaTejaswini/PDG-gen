import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		
		double[] doubleArray = new double[n];
	
		for(int i=0; i < n; i++) {
		    int s = sc.nextInt();
		    double result = a - (t - (s * 0.006));
		    result = result * result;
		    doubleArray[i] = result;
		}
		
		double min = doubleArray[0];	
		int result2 = 0;
		for (int i=0; i<doubleArray.length; i++) {
			if (min > doubleArray[i]) {	
				min = doubleArray[i];	
				result2 = i;
			}
		}
		System.out.println(result2 + 1);
	}

}
