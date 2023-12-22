import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s;
		int[] alf=new int[26];
		while(scan.hasNext()){
			s=scan.next();
			for(int i=0;i<s.length();i++){
				if('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
					alf[s.charAt(i)-'A']++;
				}else if('a'<=s.charAt(i)&&s.charAt(i)<='z'){
					alf[s.charAt(i)-'a']++;
				}else{
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.printf("%c : %d\n",(char)(i+'a'),alf[i]);
		}
		scan.close();
	}
}