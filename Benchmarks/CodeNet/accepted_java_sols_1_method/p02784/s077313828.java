import java.util.ArrayList;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		ArrayList<Long> list=new ArrayList<>();
		
		long x=scn.nextInt();
		long t=scn.nextInt();
		
		for(int i=0;i<t;i++) {
			
			long y=scn.nextLong();
			list.add(y);
		}
		
		long s=0;
		for(Long i:list) {
			s=s+i;
		}
		
		if(s>=x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		scn.close();
	}
}