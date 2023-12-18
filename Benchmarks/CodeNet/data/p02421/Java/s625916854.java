import java.util.Scanner;

public class Main{
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int taro = 0;
		int hanako = 0;
		for(int i = 0; i < n; i++) {
			String t = sc.next();
			String h = sc.next();
			int x = t.compareTo(h);
			if(x > 0) {
				taro += 3;
			}else if(x < 0) {
				hanako += 3;
			}else if(x == 0) {
				taro += 1;
				hanako  += 1;
			}
			
		}
		System.out.println(taro + " " + hanako);
	}
}

