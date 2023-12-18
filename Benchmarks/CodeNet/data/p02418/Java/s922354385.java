package test;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		//????????????????????????
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		String ans = "";

		//for (int i = 0; i < s.length(); i++) {
		//String str = s.substring(i, i + p.length());

		String str = s + s ;

		if(str.contains(p)){
			ans = "Yes";
		}else{
			ans = "No";
		}

		System.out.println(ans);
		sc.close();
	}
}