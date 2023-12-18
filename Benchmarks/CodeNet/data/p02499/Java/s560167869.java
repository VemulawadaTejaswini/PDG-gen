import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] counter=new int[26];
		while(true){
			String a=sc.next();
			if(a==null){
				break;
			}
			a=a.toLowerCase();
			for(int i=0;i<a.length();i++){
				if('a'<=a.charAt(i)&&a.charAt(i)<='z'){
					counter[a.charAt(i)-'a']++;
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.printf("%c:%d\n",'a'+i,counter[i]);
		}
	}
}