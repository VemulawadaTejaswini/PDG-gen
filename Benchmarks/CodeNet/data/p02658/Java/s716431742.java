import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long ans = 1;
		for(int i=0;i<n;i++) {
			long y = scan.nextLong();
			ans = ans * y;
		}
		
		long x = (long)Math.pow(10, 18);
		if(ans > x) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
		
	}	
	
	//�ŏ�����
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
	//����ւ�
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}
