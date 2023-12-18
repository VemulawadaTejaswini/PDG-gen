import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int r = 0;
		for(char c : S.toCharArray()){
			int v = c - '0';
			r = (r + v) % 9;
		}
		if(r % 9 == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
