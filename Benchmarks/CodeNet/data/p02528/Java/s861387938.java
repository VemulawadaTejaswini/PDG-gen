import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numbers = new int[1000];
		
		for(int i=0;i<n;i++) numbers[i] = sc.nextInt();
		
		for(int i=0;i<n;i++){
			for (int j=n-1;j>=i;j--){
				if(numbers[j]>numbers[j+1]){
					int temp;
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		System.out.printf("%d",numbers[0]);
		for(int i=1;i<n;i++) System.out.printf(" %d",numbers[i]);
		System.out.printf("\n");
	}
}