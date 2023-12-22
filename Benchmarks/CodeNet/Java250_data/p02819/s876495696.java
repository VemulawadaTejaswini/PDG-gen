import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		boolean flag = false;
		
		Outer:while(!flag) {
			for(int i = 2; i < x; i++) {
				if(x % i == 0) {
					x++;
					continue Outer;
				}
			}
			flag = true;
		}
		
		System.out.println(x);
				
				
	}

}
