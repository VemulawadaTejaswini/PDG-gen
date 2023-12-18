


import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		char[] c=S.toCharArray();
		boolean flag=true;
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1]) {
				flag=false;
				
			}
			
			
		}
		if(flag) {
			System.out.println("Good");
			
		}else {
			System.out.println("Bad");
		}
		
		
		
		
	
		
		
}
}
