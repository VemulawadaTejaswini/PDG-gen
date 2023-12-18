import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				ans+=((char)(s.charAt(i)-32));
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				ans+=((char)(s.charAt(i)+32));
			}
			else {
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
