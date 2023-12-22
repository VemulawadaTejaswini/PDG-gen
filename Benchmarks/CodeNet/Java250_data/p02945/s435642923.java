import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

        int tasu = A+B;
        int hiku = A-B;
        int kakeru = A*B;

		System.out.println(Math.max(kakeru,Math.max(tasu,hiku)));
}
}