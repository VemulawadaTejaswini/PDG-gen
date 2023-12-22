import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	int c = scan.nextInt();      
      
      	int d = ( a - b ) - c < 0 ? Math.abs(( a - b ) - c) : 0 ;
        System.out.println(d);
    }
}
