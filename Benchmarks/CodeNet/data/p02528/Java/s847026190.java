import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int min, min_index;

		for(int i=0; i<n; i++) num[i] = sc.nextInt();
		for(int i=0; i<n-1; i++){
			min = num[i];
			min_index = i;
			for(int j=i+1; j<n; j++){
				if(min>num[j]){
					min = num[j];
					min_index = j;
				}
			}
			if(min_index!=i){
				min = num[i];
				num[i] = num[min_index];
				num[min_index] = min;
			}
			System.out.printf("%d ", num[i]);
		}
		System.out.println(num[n-1]);
	}
}