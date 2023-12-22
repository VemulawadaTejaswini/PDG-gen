import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] data = new Long[N];
		for(int i=0;i<N ;i++) {
			data[i]= sc.nextLong();
		}
		int count =0;
		long t =1;
		for(int i=0;i<N;i++) {
			if(data[i]== t) {
				t++;
			}else {
				count++;
				
			}
		}
		if(t==1) {
			System.out.print("-1");
		}else {
		System.out.print(count);
	    }
	}
		
}
