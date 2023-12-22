import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] y = new int[n];

		for(int i=0; i<n; i++){
			y[i] = sc.nextInt();
		}

		int t = 0;

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				t += y[i] * y[j];
			}
		}
		System.out.println(t);
	}

}
