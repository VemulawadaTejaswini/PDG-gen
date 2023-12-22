
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.next().toCharArray();
		boolean easy = true;
		for(int i = 0; i < chars.length; i++){
			if(i % 2 == 0){
				if(chars[i] == 'L'){
					easy = false;
				}
			}else{
				if(chars[i] == 'R'){
					easy = false;
				}
			}
		}
		System.out.println(easy ? "Yes" : "No");
	}
}
