import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int X = 0;
		int []p = new int[5];
		for(int a = 0; a < 5; a++){
			p[a] = stdIn.nextInt();
			if(p[a] == 0){
				X = a;
			}
		}
		System.out.println(X+1);
		stdIn.close();
	}
}
