import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		for(int i=1; i<=360; i++) {
			if((X*i)%360==0) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}
}
