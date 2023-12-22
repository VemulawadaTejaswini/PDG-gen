import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] n = sc.next().toCharArray();
		int c = 0;
out:	for(int i = 0;i < n.length;i++) {
			for(int j = i + 1;j < n.length;j++) {
				if(n[i] == n[j]) {
					System.out.println("no");
					c = 1;
					break out;
				}
			}
		}
		
		if(c == 0) {
			System.out.println("yes");
		}
	}
}
