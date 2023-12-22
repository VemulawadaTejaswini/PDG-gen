import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] ch = s.toCharArray();

		for(int i=0;i<s.length();i++){
			if('A' <= ch[i] && ch[i] <= 'Z'){
				ch[i] += 32;	
			} else if('a' <= ch[i] && ch[i] <= 'z'){
				ch[i] -= 32;
			}
		}

		System.out.println(ch);
		}
	}
