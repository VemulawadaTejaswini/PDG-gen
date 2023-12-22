import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		ArrayList <String>list=new ArrayList<String>();
		while(scan.hasNextLine()) {
			String str=scan.nextLine();
			if (str.length() == 0) { // 文字列が空(長さゼロ)の場合
				break;
				}
			list.add(str);
		}
		int count[]=new int[26];
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			for(int j=0;j<s.length();j++) {
				char ch=s.charAt(j);
				if(ch>='a'&&ch<='z') {
					count[ch-'a']++;
				}
				if(ch>='A'&&ch<='Z') {
					count[ch-'A']++;
				}
			}
		}
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+'a')+" : "+count[i]);
		}
	}
}
