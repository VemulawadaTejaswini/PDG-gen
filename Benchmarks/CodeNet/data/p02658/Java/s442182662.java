import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = (long)Math.pow(10, 18);
		int n = scan.nextInt();
		long ans = 1;
		
		for(int i=0;i<n;i++) {
			long x = scan.nextLong();
			
			if(a < x) {
				for(int j=i+1;j<n;j++) {
					long z = scan.nextLong();
					if(z == 0) {
						System.out.println(0);
						System.exit(0);
					}
				}
				System.out.println(-1);
				System.exit(0);
			}else {
				if(x == 0) {
					System.out.println(0);
					System.exit(0);
				}
				a = a/x;
				ans *= x;
			}
			
		
		}
		
		System.out.println(ans);
		
		
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
