import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        int x,h,m,s;
    	Scanner scanner = new Scanner(System.in);
    	x = scanner.nextInt();
    	h = x/(60*60);
    	m = (x-h*60*60)/60;
    	s = x-h+60*60-m*60;
        System.out.println(h + ":" + m + ":" + s);
    }
}