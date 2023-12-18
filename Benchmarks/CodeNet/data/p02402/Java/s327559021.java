import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		int max=a[0];
		for(int j=1;j<n;j++){
			max = Math.max(max, a[j]);
		} 
		
		int min = a[0];
		for(int k=1;k<n;k++){
			min = Math.min(min, a[k]);
		}
		
		int sum = 0;
		for(int l=0;l<n;l++){
			sum = sum + a[l];
		}
		
		System.out.println(max + " " + min + " " + sum);

	}

}

