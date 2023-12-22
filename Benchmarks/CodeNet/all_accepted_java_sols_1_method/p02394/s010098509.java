import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int w = Integer.parseInt(std.next());
	    int h = Integer.parseInt(std.next());
	    int x = Integer.parseInt(std.next());
	    int y = Integer.parseInt(std.next());
	    int r = Integer.parseInt(std.next());
	    boolean ret = 0<=x-r && x+r<=w && 0<=y-r && y+r<=h;
	    if(ret){
	    	System.out.println("Yes");
	    }else{
	    	System.out.println("No");
	    }

	}
}