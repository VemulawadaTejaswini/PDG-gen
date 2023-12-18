import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i<n ; i++){
			a[i]=scan.nextInt();
		}

		
		int min = a[0];
		int max = a[0];
		long sum = 0;
		
		for(int i = 0 ; i<n ; i++){
			sum = sum + a[i];
			if(a[i]<min)min=a[i];
			if(a[i]>max)max=a[i];
		}
	
		System.out.println(min+" "+max+" "+sum);
	
	
	}
	
	

	
	
	
	static void swap(int[] a,int[] b,int i){
		int tmp =a[i];
		a[i]=b[i];
		b[i]=tmp;
		return;
	}

}