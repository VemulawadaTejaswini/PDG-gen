import static java.lang.Math.*;

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 0;
		int hc = 0;
		while(sc.hasNext()){
			String[] temp = sc.next().split(",");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int c = Integer.parseInt(temp[2]);
			if(pow(a,2) + pow(b,2) == pow(c,2)){
				tc++;
			}
			if(a == b & a + b > c || abs(a-b) < c){
				hc++;
			}
			System.out.println(tc);
			System.out.println(hc);
		}
	}
}