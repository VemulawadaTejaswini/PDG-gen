import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		for(int i=1; i<=5; i++) {
			int x = in.nextInt();
			if(x == 0) {
				System.out.println(i);
				break;
			}
		}
		
		in.close();
	}
}
