
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
	
		int check = 1;
		int count = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			
			if(a[i]==check) {
				check ++;
				count++;
			}			
		}
		
		
		
		if(count==0) {
			System.out.println(-1);
		}else {
		System.out.println(N-count);
		}
                
	}


}

