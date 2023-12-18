import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		List <String>LA=new ArrayList<String>();//LastA
		List <String>FB=new ArrayList<String>();//FirstB
		List <String>FBLA=new ArrayList<String>();//FirstALastA
		List <String>O=new ArrayList<String>();//Other
		for(int i=0;i<a;i++) {
			String s=scan.next();
			if(s.charAt(0)=='B') {
				if(s.charAt(s.length()-1)=='A') {
					FBLA.add(s);
				}
				else {
					FB.add(s);
				}
			}
			else if(s.charAt(s.length()-1)=='A') {
				LA.add(s);
			}
			else {
				O.add(s);
			}
		}
		String ans="";
		if(LA.size()!=0) {
			ans+=LA.get(0);
			LA.remove(0);
		}
		for(;FBLA.size()!=0;) {
			ans+=FBLA.get(0);
			FBLA.remove(0);
		}
		for(;FB.size()!=0&&LA.size()!=0;) {
			ans+=FB.get(0);
			FB.remove(0);
			ans+=LA.get(0);
			LA.remove(0);
		}
		for(;LA.size()!=0;) {
			ans+=LA.get(0);
			LA.remove(0);
		}
		for(;FB.size()!=0;) {
			ans+=FB.get(0);
			FB.remove(0);
		}
		for(;O.size()!=0;) {
			ans+=O.get(0);
			O.remove(0);
		}
		int ANS=0;
		for(int i=1;i<ans.length();i++) {
			char ch=ans.charAt(i-1);
			char ch2=ans.charAt(i);
			if(ch=='A'&&ch2=='B') {
				ANS++;
			}
		}
		System.out.println(ANS);
	}
}