import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int i = 1;
		while(i <= n){
			int x = i;
			if(x % 3 == 0){
				System.out.printf(" %d", i);
			} else{
				while(x != 0){
					if(x % 10 == 3){
						System.out.printf(" %d", i);
						break;
					}
					x /= 10;
				}
			}
			i++;
		}
		System.out.println("");
	}
}