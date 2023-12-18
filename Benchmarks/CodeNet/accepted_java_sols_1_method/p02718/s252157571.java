import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int M = sc.nextInt();
		int data[] = new int[N];
		double total = 0;
		int max = 0;
		for(int i = 0; i<N;i++) {
			data[i] = sc.nextInt();
			total += data[i];
		}
		for(int i = 0; i<N;i++) {
			for(int j =i+1 ;j<N;j++) {
				if(data[i]<data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		
	
		boolean F= true;
		double s = 4*M;
		double t = total*(1/s);

		for(int i = 0; i<M; i++) {
			if((data[i] < total*(1/s)) ) {
				F = false;
			
				break;
			
		}
		}
		if(F!=true) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
	

}
