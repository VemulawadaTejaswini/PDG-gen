import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();
		int cont = 0;
        stdIn.close();
        for(int i = x; i <= y; i++){
        	if (z%i==0) cont++;
        }
        System.out.println(cont);
	}
}

