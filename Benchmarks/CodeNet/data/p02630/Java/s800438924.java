import java.util.Scanner;

 class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0 ;i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		int q = sc.nextInt();
		while(q>0) {
			int sum =0;
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int i=0 ;i< n ;i++) {
				if(arr[i]==b)
					arr[i]=c;
				sum =sum+arr[i];
			}
			System.out.println(sum);
				
				q--;
		}
		
	}

}
