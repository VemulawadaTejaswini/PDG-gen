import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ns = s.substring(s.indexOf("A"),s.lastIndexOf("Z")+1);
		System.out.println(ns.length());
	}
}
