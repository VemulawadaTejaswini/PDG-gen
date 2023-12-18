import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int W = scn.nextInt();
		    int H = scn.nextInt();
		    int x = scn.nextInt();
		    int y = scn.nextInt();
		    int r = scn.nextInt();

		    int set=0;
		    if(x+r>W) {
		    	set=1;
		    }
		    if(y+r>H) {
		    	set=1;
		    }
		    if(r>x) {
		    	set=1;
		    }
		    if(r>y) {
		    	set=1;
		    }
		    
		    if(set == 0) {
		    	System.out.println("Yes");
		    }else {
		    	System.out.println("No");
		    }

	}
}