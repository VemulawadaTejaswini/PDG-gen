//Volume0-0050
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
        char[] c;
        int    small,
               large;
        StringBuffer sb = new StringBuffer();

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
        	c = sc.next().toCharArray();

        	//calculation
        	sb.delete(0,8);
        	Arrays.sort(c);
        	small = Integer.parseInt(String.valueOf(c));
        	sb.append(c);
        	sb = sb.reverse();
        	large = Integer.parseInt(sb.toString());

        	//output
        	System.out.println(large - small);
        }
	}
}