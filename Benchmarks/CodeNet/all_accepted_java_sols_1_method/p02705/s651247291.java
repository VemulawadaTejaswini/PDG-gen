import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        scan.close();
		System.out.println( num * 2 * Math.PI);
    }
}