//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int count = 0;
			for(int i=0;i<=25;i++) {
				for(int j=0;j<15;j++) {
					int X = 4*i+7*j;
					if(N==X) {
						count ++;
					}
				}
			}
			if(count>0) {
				System.out.println("Yes");
			}else
				System.out.println("No");
			
	}		
}