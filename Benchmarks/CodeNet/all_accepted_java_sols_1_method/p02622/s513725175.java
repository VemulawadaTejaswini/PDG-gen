//package hiougyf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 String s=sc.next();
		 int nas=0;
		 String a=sc.next();
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)!=a.charAt(i)) nas++;
		 }
		 System.out.println(nas);
		}
}
