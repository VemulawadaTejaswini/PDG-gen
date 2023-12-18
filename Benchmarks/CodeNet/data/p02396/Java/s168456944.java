import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bl = true;
		int n = 0;
		int i = 0;
		int[] x = new int[n];
		while(bl){
			x[n] = stdIn.nextInt();
			if(x[n] == 0) bl = false;
			n++;
		}
		while(i < n){
			System.out.println("Case " + i + ":" + x[i]);
			i++;
		}
	}

}