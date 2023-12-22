
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.next().toCharArray();
		char[] chars2 = sc.next().toCharArray();
		int count = 0;
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == chars2[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}
