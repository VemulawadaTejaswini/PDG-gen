import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int i = 0;
        while(true){
            x = sc.nextInt();
            if ( x == 0 ) break;
            i = i + 1;
            System.out.println("Case " + i + ": " + x );
            
        }
	}

}
