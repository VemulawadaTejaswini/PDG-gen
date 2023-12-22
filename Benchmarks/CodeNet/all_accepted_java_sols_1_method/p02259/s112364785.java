import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n ;
		int count = 0;
		n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
			for(int j = n-1;j>i;j--){
				if(a[j] <a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					count++;
				}
			}
			
		}
		
		for(int i = 0;i<n;i++){
			if(i>0)System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println("");
		System.out.println(count);
	}
}