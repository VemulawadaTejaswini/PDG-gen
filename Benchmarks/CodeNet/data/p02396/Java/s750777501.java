import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,i=0;
		while(true){
			i++;
			x = in.nextInt();
			if(x == 0) break;
			System.out.println("Case " + i + ": " + x);
		}
	}
}