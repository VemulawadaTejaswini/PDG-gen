import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char[] ch = s.toCharArray();
		
		String str = scan.next();
		char[] w = str.toCharArray();
		
		for(int i = 0; i < ch.length - (w.length - 1); i++){
			for(int j = 0; j < w.length; j++){
				if(ch[i + j] == w[j]){
					if(j == w.length - 1)System.out.println(i);
				}else break;
			}
		}
		
	}
}