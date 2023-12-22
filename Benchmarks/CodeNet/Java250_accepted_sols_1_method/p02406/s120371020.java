import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		int x;
		
		for(int i=1; i<=n; i++) {
			x = i;
			if(x%3 == 0) {
				str += " "+i;
				continue;
			}
			if(x%10 == 3) {
				str += " "+i;
				continue;
			}
			x /= 10;
			while(x != 0) {
				if(x%10 == 3) {
					str += " "+i;
					break;
				}
				x /= 10;
			}
		}
		
		System.out.println(str);
	}
}