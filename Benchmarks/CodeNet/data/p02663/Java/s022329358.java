import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int span = (H2 - H1) * 60 + M1 + M2;
		if(span - K <= K){
			System.out.print(0);
		}else{
			System.out.print(span - K);
		}
	}
}