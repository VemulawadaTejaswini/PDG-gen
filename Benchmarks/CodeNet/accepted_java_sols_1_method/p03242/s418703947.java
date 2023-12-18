import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=Integer.toString(n);
		int len=str.length();
		String s="";
		for(int i=0;i<=len-1;i++) {
			if(str.charAt(i)=='1') {
				s+='9';
			}
			else if(str.charAt(i)=='9') {
				s+='1';
			}
	}
		System.out.println(s);
	}
}