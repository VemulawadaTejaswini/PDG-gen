public class Main {
	static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int tate = scan.nextInt();
		int yoko = scan.nextInt();

		int[][] arr  = new int[tate][yoko];
		int sum = 0;
		int kai = 0;
		for(int i = 0; i < tate; i++){
			sum = 0;
			for(int j = 0; j < yoko; j++){
				arr[i][j] = scan.nextInt();
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			kai += sum;
			System.out.println(sum);
		}

		for(int i = 0; i < yoko; i++){
			sum = 0;
			for(int j = 0; j < tate; j++){
				sum += arr[j][i];
			}
			System.out.print(sum + " ");
		}
		System.out.println(kai);
	}
}