import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] arr = new long[n];
		int count = 0;

		for(int i=0;i<n;i++) {
			arr[i] = scan.nextLong();
		}
		scan.close();

		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++){
				for(int k=j;k<n;k++) {
					if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]) {
						if(arr[i]+arr[j]>arr[k] && arr[j]+arr[k]>arr[i] && arr[k]+arr[i]>arr[j]) {
							count++;
						}
					}

				}
			}
		}

		System.out.println(count);

	}

}
