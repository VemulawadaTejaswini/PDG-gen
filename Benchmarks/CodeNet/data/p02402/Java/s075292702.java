import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int min = 0; 
		int sum = 0;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for(int i = 0;i<n;i++){
			 max = a[0];
			 min = a[0];
			if(max < a[i]){
				max = a[i];
			}
			if(min > a[i]){
				min = a[i];
			}
		}

	for(int i = 0;i<n;i++)
		sum+=a[i];
		System.out.print(min+" ");
		System.out.print(max+" ");
		System.out.println(sum);
		sc.close();
	}

}

