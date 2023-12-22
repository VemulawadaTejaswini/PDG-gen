import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		while(sc.hasNext()){
			str=sc.next();
			char[] ch=new char[str.length()];
			for(int i=0;i<str.length();i++){
				ch[i]=str.charAt(i);
			}
			char[] ans=new char[str.length()];
			for(int i=0;i<str.length();i++){
				ans[i]=ch[str.length()-i-1];
			}
			str=String.valueOf(ans);
			System.out.println(str);
		}
		sc.close();
	}
}