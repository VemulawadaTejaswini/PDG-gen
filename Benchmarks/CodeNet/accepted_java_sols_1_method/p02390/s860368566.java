import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int time = Integer.parseInt(std.next());
	    int s = time%60;
	    int m = (time / 60) % 60;
	    int h = (time / 3600);
	    System.out.println(h+":"+m+":"+s);
	}
}