import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		int h = stdIn.nextInt();
		int w = stdIn.nextInt();
		int n = stdIn.nextInt();

		if(h > w){
			System.out.println((int)Math.ceil((double)n/h));
		}else{
			System.out.println((int)Math.ceil((double)n/w));
		}
	}
}
