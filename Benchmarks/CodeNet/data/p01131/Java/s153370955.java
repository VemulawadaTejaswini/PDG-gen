import java.util.Scanner;

public class Main {

	static char[][] chars = { 
		{'.',',','!','?',' '},
		{'a','b','c'},
		{'d','e','f'},
		{'g','h','i'},
		{'j','k','l'},
		{'m','n','o'},
		{'p','q','r','s'},
		{'t','u','v'},
		{'w','x','y','z'}
	};
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		int n = cin.nextInt();
		for(int kaisuu = 0; kaisuu < n; kaisuu++){
			String str = cin.next();
			char[] s = str.toCharArray();
			str = "";
			for(int i = 0; i < s.length;){
				int num = s[i]-'0';
				int count=0;
				while(i+1 < s.length){
					if(s[i+1]==s[i]){
						i++;
						count++;
					}
					else{
						break;
					}
				}
				i++;
				str += henkan(num, count);
			}
			System.out.println(str);
		}
	}
	static char henkan(int num, int count){
		if(num==0){
			return 0;
		}
		count = count%chars[num-1].length;
		
		return chars[num-1][count];
	}
}