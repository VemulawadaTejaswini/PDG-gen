import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int z = 0;
            for(int i = 1; i <= a; i++) {
            	if(a % i == 0 && b % i == 0) {
            		z = i;
            	}
            }
            System.out.println(z);
	}
}
