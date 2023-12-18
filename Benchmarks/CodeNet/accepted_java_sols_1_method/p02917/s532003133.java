import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []array_A=new int[n];
		int[]array_B=new int[n-1];
		int goukei=0;
		for(int i=0;i<n-1;i++){
			array_B[i]=scan.nextInt();
		}
		goukei+=array_B[0];
		goukei+=array_B[n-2];

		for(int i=1,j=0;i<n-1;i++,j++){
			if(array_B[j]<=array_B[j+1]){
				array_A[i]=array_B[j];
			}else{
				array_A[i]=array_B[j+1];
			}
			goukei+=array_A[i];
		}
		System.out.println(goukei);
	}
}
