import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("Case " + i + ":");
			int m = sc.nextInt();
			for(int j=0;j<10;j++){
				m = (m*m/100)%10000;
				System.out.println(m);
			}	
		}
	}	
}