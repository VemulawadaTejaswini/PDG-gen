import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int max = (arr[1]-arr[0]);
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				max = Math.max(max, (arr[j]-arr[i]));
			}
		}
		System.out.println(max);
	}
}