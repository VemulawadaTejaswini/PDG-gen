//時間かかりすぎ

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int count = 1;
		long s = 7;
		
		while(count <= k){
			if(s % k == 0){
				System.out.println(count);
				return;
			}
			count++;
			s = ((s * 10) + 7) % k;
			
		}
		System.out.println("-1");
	}
}
