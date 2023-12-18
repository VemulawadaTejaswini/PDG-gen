import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String g ="";
		System.out.println(str.length());
       for(int i= 0;i<(str.length()/2);i++) {
    	   g+="PD";
        }
        sc.close();
        System.out.println(g);

	}
}