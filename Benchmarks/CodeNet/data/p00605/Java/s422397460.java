import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			if(n==0&&k==0){
				return;
			}
			int[] have = new int[k];
			for(int i=0;i<k;i++){
				have[i] = stdIn.nextInt();
			}
			boolean f = true;
			for(int i=0;i<n;i++){
				for(int j=0;j<k;j++){
					have[j] -= stdIn.nextInt();
					if(have[j]<0){
						f = false;
					}
				}
			}
			if(f){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}