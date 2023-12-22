import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h,m,s,S;
    	S = sc.nextInt();
    	
    	
    	h = S/(60*60);
    	S = S - h*60*60;
    	m = S/60;
    	s = S%60;
    	System.out.println(h + ":" + m + ":" + s);
    	
    }
}