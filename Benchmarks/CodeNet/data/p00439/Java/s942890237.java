import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			if((n|k)==0){
				return;
			}
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = stdIn.nextInt();
			}
			int max = 0;
			for(int i=0;i<n-k;i++){
				int s = 0;
				for(int j=i;j<i+k;j++){
					s+=a[j];
				}
				if(max<s){
					max = s;
				}
			}
			System.out.println(max);
		}
	}
}