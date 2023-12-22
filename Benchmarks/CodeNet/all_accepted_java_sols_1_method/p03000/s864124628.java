import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		
		int count=1;
		int distance=0;
		
		for(int i=0;i<N;i++) {
			int L=Integer.parseInt(sc.next());
			if(X>=distance+L) {
				distance+=L;
				count++;
			}else {
				break;
			}
			
		}
		System.out.println(count);
		sc.close();
	}
}