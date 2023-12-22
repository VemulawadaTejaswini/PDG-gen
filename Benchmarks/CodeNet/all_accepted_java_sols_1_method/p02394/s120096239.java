import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		boolean n = true;
		if(x-r >= 0) {
			if(y-r >= 0){
				if(x+r <= W) {
					if(y+r <= H){
						System.out.println("Yes");
						n = false;
					}
				}
			}
		}
		if(n) System.out.println("No");
		
		
	}
}


