import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			if(i%3==0){
				System.out.print(" "+i);
			}
			else if(i%10==3){
				System.out.print(" "+i);
			}
			i++;
		}
	}
}