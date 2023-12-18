import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] h = new double[n];
		int[] x = new int[6];
		for(int i = 0 ; i < n ;i++){
			h[i] = sc.nextDouble();
		}
		for(int i = 0 ; i < n ;i++){
			if(h[i] >= 185.0){
				x[5]++;
			} else if (h[i] >= 180.0){
				x[4]++;
			} else if (h[i] >= 175.0){
				x[3]++;
			} else if (h[i] >= 170.0){
				x[2]++;
			} else if (h[i] >= 165.0){
				x[1]++;
			} else {
				x[0]++;
			}
		}
		for(int i = 1 ; i <= x.length ;i++){
			System.out.print(i +":");
			for(int k = 0 ; k < x[i-1] ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}