import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char ans = s.charAt(s.length()-1);
		int n = (int)ans-48;
		
		while(true) {
			if(n>=10) {
				n -= 1;
			}else {
				break;
			}
		}
		
		if(n == 2 || n == 4 || n==5 || n== 7 || n==9) {
			System.out.println("hon");
		}else if(n==0 || n==1 || n== 6 || n==8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
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

