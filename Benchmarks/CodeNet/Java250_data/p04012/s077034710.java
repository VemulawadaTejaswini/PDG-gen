import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		boolean c = true;
		for(int i=0;i<w.length();i++){
			if(check(w,w.charAt(i))){
				c = true;
			}else{
				c = false;
				break;
			}
		}
		if(c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public static boolean check(String s,char c){
		int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == c){
				count++;
			}
		}
		if(count%2 == 0){
			return true;
		}else{
			return false;
		}
	}
}
