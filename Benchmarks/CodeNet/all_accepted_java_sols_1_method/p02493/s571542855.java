import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = scan.nextInt();
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(num[i]);
			if(i!=0){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}