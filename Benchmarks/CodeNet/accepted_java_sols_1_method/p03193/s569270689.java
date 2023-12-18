import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int h = sc.nextInt();
	    int w = sc.nextInt();
	    int count = 0;
	    for(int i = 0; i < n; i++) {
	    	int tmpA = sc.nextInt();
	    	int tmpB = sc.nextInt();
	    	if(tmpA >= h && tmpB >= w) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
}