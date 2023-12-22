import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=0;i<=50000;i++) {
			int now = i*108;
			if(N*100<=now&&now<(N+1)*100) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(":(");
	}
}