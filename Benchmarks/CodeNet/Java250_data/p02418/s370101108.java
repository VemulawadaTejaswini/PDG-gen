import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=false;
		String str1=sc.next();
		String str2=sc.next();
		String str3=str1+str1;
		char [] ch2=str2.toCharArray();
		char [] ch3=str3.toCharArray();
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(ch2[j]!=ch3[i+j])break;
				if(j+1==str2.length()&&ch2[j]==ch3[i+j]) {
					b=true;
				}
			}
		}
		if(b==true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
