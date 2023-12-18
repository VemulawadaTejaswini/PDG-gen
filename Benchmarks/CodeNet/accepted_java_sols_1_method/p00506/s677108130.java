import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
			if(min>a[i]) min = a[i];
		}
		for(int i=1;i<=min;i++){
			boolean flag = true;
			for(int j=0;j<n;j++){
				if(a[j]%i!=0){
					flag = false;
					break;
				}
			}
			if(flag) System.out.println(i);
		}
	}
}