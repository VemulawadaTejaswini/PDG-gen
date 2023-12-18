import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (1<=A&&A<=100 &&1<=B&&B<=100 &&1<=C&&C<=100 &&1<=D&&D<=100 ){
		}
		else{
			throw new IllegalArgumentException("不適切な数値です。");
		}
		while(A> 0 && C> 0){	
			C -= B;
			if (C > 0){
				A -= D;
			}else{
				System.out.println("Yes");
				return;
			}
		}
			System.out.println("No");
	}
	
}