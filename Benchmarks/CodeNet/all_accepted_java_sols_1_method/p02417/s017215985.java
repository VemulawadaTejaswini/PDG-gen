import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		int count[] = new int[26];
		char al = 'a';
		while(sc.hasNext()){
			tmp += sc.nextLine();
		}
		for(int i = 0; i < tmp.length(); i++){
			int c = tmp.charAt(i);
			if('a' <= c && c <= 'z'){
				count[c - 'a']++;
			}else if('A' <= c && c <= 'Z'){
				count[c - 'A']++;
			}
		}
		for(int i = 0; i < count.length; i++){
			System.out.println(al++ + " : " + count[i]);
		}
	}

}