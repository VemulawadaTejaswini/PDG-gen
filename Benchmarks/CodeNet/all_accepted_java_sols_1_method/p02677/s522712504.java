import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		double kaku = 0;
		
		double h_kaku = h*30;
		if(m!=0) {
			h_kaku += m*0.5;
		}
		double m_kaku = m*6;
		
		kaku = Math.min(h_kaku-m_kaku, 360-(h_kaku-m_kaku));
		double ans = 0;
		
		
		if(kaku!=90) {
			ans = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(kaku*(Math.PI/180));
		}else {
			ans = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*0;
		}
		
		System.out.println(Math.sqrt(ans));
		
		
		
		
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

