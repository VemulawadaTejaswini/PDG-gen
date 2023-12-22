import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count =0;
		int flag =0;
		int N = scanner.nextInt();
		int[] a = new int[N];
		
		for(int i=0; i<N;i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i=0;i<N-1;i++) {
			if(a[i] == a[i+1] && flag ==0) {
					count++;
					flag=1;
			}
			else {
				flag=0;
			}
		}
		
	    System.out.println(count);
		scanner.close();
	}

}
