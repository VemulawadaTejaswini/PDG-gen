import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] X = new int [5] ;
		int ans = 0;
		
		for(int i=0;i<5;i++) {
			X[i] = sc.nextInt();
			if(X[i]==0) {
				ans = i+1;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}