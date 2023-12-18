import java.util.Scanner;

public class Main{
	static char[][] keitai = {{},{'.',',','!','?',' '},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	static char change(int a,int b) {
		int d = 0;
		if(a==0)
			d = 0;
		if(b==1)
			d = b%4;
		if(b==7 || b==9) {
			d = b%3;
		}
		else
			d = b%2;
		char in = keitai[a][d];
		return in;
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				char[] s = sc.next().toCharArray();
				StringBuilder sb = new StringBuilder(s.length);

				int i = 0;
				while(i<s.length){
	                if(s[i]=='0')i++;
	                else{
	                    char c = s[i++];
	                    int k = 0;
	                    while(s[i]==c){i++;k++;}
	                    sb.append(keitai[c-'0'][k%keitai[c-'0'].length]);
	                    i++;
	                }
	            }
				System.out.println(sb.toString());
			}
		}
	}
}

