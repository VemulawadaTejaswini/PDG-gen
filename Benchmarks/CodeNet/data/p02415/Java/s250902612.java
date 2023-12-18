import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] s=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if('A'<=s[i]&&s[i]<='Z'){
				s[i]+=32;
			}
			else if('a'<=s[i]&&s[i]<='z'){
				s[i]-=32;
			}
		}
		System.out.println(s);
	}
}	
