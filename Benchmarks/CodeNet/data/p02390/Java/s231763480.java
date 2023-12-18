import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        int S,h,m,s;
    	Scanner scanner = new Scanner(System.in);
    	S = scanner.nextInt();
    	h = S/(60*60);
    	m = (S-h*60*60)/60;
    	s = S-h+60*60-m*60;
        System.out.println(h + ":" + m + ":" + s);
    }
}