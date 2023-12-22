import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    int D = sc.nextInt();
		int C = sc.nextInt();
	    int sum = 0;
		
		for(int i = 0; i <10; i++){
		sum = r * C - D;
		System.out.println(sum);
		C = sum;
		}
	}
}	