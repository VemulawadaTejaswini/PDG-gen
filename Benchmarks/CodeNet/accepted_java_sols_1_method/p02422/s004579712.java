import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();
		
		String Cstr = str;
		
		for(int i=0;i<n;i++) {
			String prg = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(prg.equals("replace")) {
				String prs = sc.next();
				String Ccstr = "";
				//置換したい箇所を抜き出して置き換える
				for(int j=a;j<=b;j++) {
					Ccstr += Cstr.charAt(j);
				}
				//Ccstr.replace(Ccstr,prs);
				Ccstr = prs;
				//ここまで
				//置換したい箇所の前
				String Sstr = "";
				if(a != 0) {
					for(int j=0;j<a;j++) 
						Sstr += Cstr.charAt(j);
					
				}
				//ここまで
				//置換したい箇所の後ろ
				String Bstr = "";
				if(b != Cstr.length()) {//チェックポイント
					for(int j=b+1;j<Cstr.length();j++) 
						Bstr += Cstr.charAt(j);
					
				}
				//ここまで
				Cstr = Sstr + Ccstr + Bstr;
			}else if(prg.equals("reverse")) {
				String Vstr = "";
				for(int j=a;j<=b;j++) 
					Vstr += Cstr.charAt(j);
				StringBuffer sb = new StringBuffer(Vstr);
				Vstr = sb.reverse().toString();
				//反転したい箇所の前
				String Sstr = "";
				if(a != 0) {
					for(int j=0;j<a;j++) 
						Sstr += Cstr.charAt(j);
					
				}
				//ここまで
				//反転したい箇所の後ろ
				String Bstr = "";
				if(b != Cstr.length()) {//チェックポイント
					for(int j=b+1;j<Cstr.length();j++) 
						Bstr += Cstr.charAt(j);
					
				}
				//ここまで
				Cstr = Sstr + Vstr + Bstr;
			}else {
				for(int j=a;j<=b;j++)
					System.out.print(Cstr.charAt(j));
				System.out.println();
			}
		}
	}
}

