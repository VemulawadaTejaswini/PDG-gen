import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int S = sc.nextInt();
		final int W = sc.nextInt();
		sc.close();
		if(S>W){
			System.out.println("safe");
		}else{
			System.out.println("unsafe");
		}
	}
}
