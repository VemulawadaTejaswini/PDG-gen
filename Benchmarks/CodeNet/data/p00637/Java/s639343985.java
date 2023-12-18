import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = stdIn.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++){
				System.out.print(a[i]);
				for(int j=i+1;j<n;j++){
					if(j==n-1&&a[n-2]+1==a[n-1]){
						System.out.print("-"+a[j]);
						i = j;
						break;
					}
					else if(a[j-1]+1!=a[j]){
						if(i!=j-1){
							System.out.print("-"+a[j-1]);
							i = j-1;
						}
						break;
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}