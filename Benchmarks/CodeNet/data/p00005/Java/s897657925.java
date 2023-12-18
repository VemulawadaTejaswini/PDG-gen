import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			boolean judge = false;
			for(int i=b; i>0; i--) {
				if(a%i == 0 && b%i == 0) {
					System.out.print(i);
					judge = true;
				}
				if(judge) break;
			}
			judge = false;
			for(int i=1; i<a; i++) {
				for(int j=1; j<b; j++) {
					if(a*i == b*j) {
						System.out.print(" " + a*i);
						judge = true;
					}
					if(a*i < b*j) break;
				}
				if(judge) break;
			}
		}
	}
}