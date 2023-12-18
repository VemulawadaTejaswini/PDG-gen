import java.util.Scanner;

public class Main {
	static int N=0;
	static long count=0L;
	static long max=0L;
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			N = Integer.parseInt(sc.next());
			Long a[] = new Long[N]; 
			for(int i=0;i<N;i++) {
				a[i] = Long.parseLong(sc.next());
			}
			for(int i=0;i<N;i++) {
				if(max<a[i]) {
					max = a[i];
				} else {
					count += max-a[i];
				}
				
			}
		}
		System.out.println(count);
	}
}