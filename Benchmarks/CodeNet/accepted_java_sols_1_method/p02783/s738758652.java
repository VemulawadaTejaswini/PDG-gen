import java.util.Scanner;
 
public class Main {
    static int scoreR;
    static int scoreS;
    static int scoreP;
	public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int h = scn.nextInt();
            int a = scn.nextInt();
            int ret = h % a == 0 ? h / a : h / a + 1;

            System.out.println(ret);
	}
	
}
