

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int count = 0;
		int length = 0;
		Scanner sc = new Scanner(System.in);
			String s = sc.next();
			length = s.length();
			String t = sc.next();		
			
			if(t.length() != length) {
				System.out.println("2 String have diffrent length.");
				return;
			}	
			
			for(int i=0;i<length;i++) {
				if(!s.substring(i, i+1).equals(t.substring(i,i+1))){
					count++;
				}
			}
			System.out.println(count);
			count=0;
		
	}
	
}