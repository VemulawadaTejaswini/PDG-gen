import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		String s = "zabcdefghijklmnopqrstuvwxy";
		String ss = "";
		while(n>0){
			ss= s.charAt((int)(n%26))+ss;
			n/=26;
		}
		System.out.println(ss);
	}
}
