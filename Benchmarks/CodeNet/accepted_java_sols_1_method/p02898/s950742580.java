import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int c = 0;
        for(int i = 0; i < n; i++) {
        	if(sc.nextInt() >= h) {
        		c++;
        	}
        }

        System.out.println(c);
        return;
    }
}