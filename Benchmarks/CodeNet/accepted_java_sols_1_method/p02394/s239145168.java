import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int W,H,x,y,r;
		
		Scanner scan = new Scanner(System.in);

		W= Integer.parseInt(scan.next());
	    H= Integer.parseInt(scan.next());
	    x= Integer.parseInt(scan.next());
	    y= Integer.parseInt(scan.next());
	    r= Integer.parseInt(scan.next());
	    if(0<=x-r&&0<=y-r&&W>=x+r&&H>=y+r) {
	    System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
	    
	}

}