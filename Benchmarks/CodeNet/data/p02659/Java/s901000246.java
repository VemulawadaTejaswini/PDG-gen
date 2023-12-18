import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		double b = scan.nextDouble();
		
		long ans = (long)(a*b);
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

