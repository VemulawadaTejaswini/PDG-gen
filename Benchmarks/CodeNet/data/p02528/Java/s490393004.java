import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=n-1;j>i;j--){
				if(array[j-1]>array[j]){
					int x = array[j-1];
					array[j-1] = array[j];
					array[j] = x;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.printf("%d ",array[i]);
		}
		System.out.printf("\n");
	}

}