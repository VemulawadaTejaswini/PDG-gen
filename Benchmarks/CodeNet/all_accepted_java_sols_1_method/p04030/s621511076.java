

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="";

		String moto=sc.next();

		for(int i=0; i<moto.length(); i++) {
			if(moto.charAt(i)=='0') {
				a=a+"0";
			}
			else if(moto.charAt(i)=='1') {
				a=a+"1";
			}

			else if(moto.charAt(i)=='B') {
				if(a.length()>0) {
					a=a.substring(0,a.length()-1);
				}
				else {
					//
				}
			}
		}
		System.out.println(a);
	}
}