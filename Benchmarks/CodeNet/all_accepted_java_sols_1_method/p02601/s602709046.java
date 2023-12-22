import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		
		for(int i=0;i<k;i++) {
			if(a>=b) {
				b = b*2;
			}else if(b>=c){
				c = c*2;
			}
		}
		
		if(a<b && b<c && a<c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
