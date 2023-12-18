import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	    	int count = 0;
	    	for (int i = 0; i < 4; i++) {
			if (String.valueOf(String.valueOf(n).charAt(i)).equals("2")) {
				count++;
			}
		}
	    	System.out.println(count);
	}
}
