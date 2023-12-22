import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		char[] c = tmp.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(c[i] >= 'a' && c[i] <= 'z' ){
				c[i] -= 32;
			}else if(c[i] >= 'A' && c[i] <= 'Z'){
				c[i] += 32;
			}
		}
		System.out.println(String.valueOf(c));
	}
}