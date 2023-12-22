import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		int p;
		int i=0;
        sc =new Scanner(System.in);  
		int count[] = new int[26];
		String str;
		char c;
		
	    
		while(sc.hasNext()){
			str=sc.next();
			for(int j=0;j<str.length();j++) {
				c=str.charAt(j);
				if(c>='A'&&c<='Z') {
					c+=32;
				}else if(c>='a'&&c<='z') {
					
				}else {
					continue;
				}
				p= c-'a';
				count[p]++;
			}
		}
		for(i=0;i<26;i++) {
			System.out.printf("%c : %d\n",i+'a',count[i]);
		}
	}
	
}

