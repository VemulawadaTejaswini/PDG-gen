import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int W = scn.nextInt();
		    int H = scn.nextInt();
		    int x = scn.nextInt();
		    int y = scn.nextInt();
		    int r = scn.nextInt();

	    	if(H>y & W>x) {
	    		if(r<=x & r<=y) {
	    		System.out.println("Yes");
	    		}
	    	}
	    	else {
	    		System.out.println("No");
	    	}
	}
}