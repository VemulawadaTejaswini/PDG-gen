import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] l = new int[a];

        for(int i = 0; i < a; i++) {
        	l[a] = sc.nextInt();
        }

        for(int j = a-1; j <= 0; j--) {
        	if(j == 0) {
            	System.out.print(l[j]);
        	} else {
            	System.out.print(l[j] + " ");
        	}

        }
	}
}

