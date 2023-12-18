import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();

        final int MAX = 1000000;
        final int MIN = -1000000;

        int max = Math.min(MAX, x + k -1);
        int min = Math.max(MIN, x - k + 1);

        StringBuilder sb = new StringBuilder();
        final String BLANK = " ";
        for(int i = min; i <= max; i++) {
        	sb.append(i);
        	if(i != max) {
        		sb.append(BLANK);
        	}
        }
        System.out.println(sb.toString());
	}
}