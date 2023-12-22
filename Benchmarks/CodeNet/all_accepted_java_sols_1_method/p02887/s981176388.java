import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1 ;
        char[] cs = sc.next().toCharArray();

        char back = cs[0];
        for(int i = 1; i < n; i++) {
        	if(cs[i] != back) {
        		c++;
        		back = cs[i];
        	}
        }


        System.out.println(c);

    }


}