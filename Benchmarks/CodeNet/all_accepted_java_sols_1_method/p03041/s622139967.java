import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		String m = sc.next();
		
		char c[] = m.toCharArray();
		y = y -1;
		if(c[y]=='A'){
			c[y] = 'a';			
		}else if(c[y]=='B'){
			c[y] = 'b';
		}else{
			c[y] = 'c';
		}
		
		for(int i = 0;i < c.length; i++){
			System.out.print(c[i]);
		}
	}
}
