import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		
		for (int i=0; i<1001; i++) {
			if(i*8/100==A && i*10/100==B){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}