import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();

		char[] aa=new char[a.length()];
		for(int i=0; i<a.length(); i++) {
			aa[i]=a.charAt(i);
		}

		String ans="";

		for(int i=0; i<a.length(); i++) {
			if(aa[i]!='@') {
				ans=ans+aa[i];
			}
			else if(aa[i]=='@') {
				int kaisu=Integer.parseInt(aa[i+1]+"");

				String tmp="";

				for(int j=0; j<kaisu; j++) {
					tmp=tmp+aa[i+2]+"";
				}
				ans=ans+tmp;
				i++;
			}
		}
		System.out.println(ans);
	}
}
