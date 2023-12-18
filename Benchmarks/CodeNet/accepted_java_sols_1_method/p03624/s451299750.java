import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] x=new int[26];
		for(int i=0;i<s.length();i++){
			x[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			if(x[i]==0){
				System.out.print((char)(i+'a'));
				break;
			}
			if(i==25)
				System.out.print("None");
		}
	}
}
