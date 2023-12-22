import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		int time;
		
		if(a<=c) {
			time = Math.min(b-c, d-c);
		}else {
			time = Math.min(b-a, d-a);
		}
		
		if(time<0) {
			time = 0;
		}
		System.out.println(time);
	}

}