import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        (new Main()).execute();
    }
    private static final String YES = "YES";
    private static final String NO = "NO";
    private void execute() {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        for(int i = 0 ; i < games ; i++) {
        	int b = 0;
        	int c = 0;
        	boolean isCollect = true;
        	for(int j = 0 ; j < 10 ; j++) {
        		int ball = sc.nextInt();
        		if(ball > b && ball > c) {
        			if(b > c) {
        				b = ball;
        			} else {
        				c = ball;
        			}
        		} else if(ball > b) {
        			b = ball;
        		} else if(ball > c) {
        			c = ball;
        		} else {
        			isCollect = false;
        			break;
        		}
        	}
    		System.out.println(isCollect ? YES : NO);
        }
        sc.close();
    }
}