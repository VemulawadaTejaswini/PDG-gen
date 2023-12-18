import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
	
		int A = scr.nextInt();
		int B = scr.nextInt();
		int c = scr.nextInt();
		int K = scr.nextInt();
		
		int X = K-A;//A���Ƃ��āC���ƂƂ�K�v�̂��閇��
		int Y = K-X;//A�̖���
		
		int Z = X-B;//
		
		int max;
	
		if(X < 0) {
			System.out.println(K);
		}else {
			if(X-B < 0) {
				System.out.println(Y);
			}else {
				max = (Z*-1)+(Y);
				System.out.println(max);
			}
		}
		
		
	
	}
}