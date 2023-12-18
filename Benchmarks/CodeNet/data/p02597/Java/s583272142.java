package java_selfwork_freetime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		String[] line=str2.split("");
		
		int count=0;
		
		for(String str:line) {
			if(str.equals("R")) {
				count++;
			}
		}
		
		int point=0;
		
		for(int i=0;i<count;i++) {
			if(line[i].equals("R")) {
				point++;
			}
		}
		
		System.out.println(count-point);
		
		sc.close();
	}
}
