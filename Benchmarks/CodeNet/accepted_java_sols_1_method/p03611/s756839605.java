import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[][] = new int [3][n];
		int count[] = new int [100002]; 
		
		for(int i = 0 ; i<n ; i++){
			arr[0][i] = scanner.nextInt();
		}
		for(int i = 0 ; i<n ; i++){
			arr[1][i] = arr[0][i]-1;
		}
		for(int i = 0 ; i<n ; i++){
			arr[2][i] = arr[0][i]+1;
		}
		
		for(int i = 0 ; i<3 ; i++){
			for(int j = 0 ; j<n ; j++){
				count[arr[i][j]+1]++;
			}
		}
		
		int max = 0;
		for(int i=0 ; i<count.length ; i++){
			if(count[i]>max){
				max = count[i];
			}
		}
		System.out.println(max);
		
	}
}
