import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int temp;

		for(int i=0; i<n; i++) num[i]=sc.nextInt();
		for(int i=0; i<n-1; i++){
			for(int j=n-1; j>i; j--){
				if(num[j]<num[j-1]){
					temp = num[j];
					num[j] = num[j-1];
					num[j-1] = temp;
				}
			}
			System.out.printf("%d ", num[i]);
		}
		System.out.println(num[n-1]);
	}
}