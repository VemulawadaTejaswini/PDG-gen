import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] a=new int[26];
		while(scan.hasNext()){
		
			String str = scan.nextLine();
			str = str.toLowerCase();
		
			for(int i=0;i<str.length();i++)
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					a[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
			System.out.printf("%c : %d\n",i+'a',a[i]);
	}
}
