import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		StringBuilder str;
		char c;
		int start, end, len;
		while((n = sc.nextInt()) != 0){
			str = new StringBuilder(256);
			str = str.append(sc.next());
			for(int i = 0; i < n; i++){
				len = str.length();
				c = str.charAt(0);
				start = 0;
				for(int j = 1; j < len; j++){
					if(str.charAt(j) != c){
						str.replace(start, j, Integer.toString(j - start) + c);
						j += str.length() - len;
						len = str.length();
						start = j;
						c = str.charAt(j);
					}
				}
				str.replace(start, len, Integer.toString(len - start) + c);
			}
			System.out.println(str);
		}
	}
}