import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int x,y;
        for(int count = 1; ;count++){
        	x = scan.nextInt();
    	    y = scan.nextInt();
    	    if(x == 0 && y == 0)
    	    	break;


    	    if(x < y){

    	    	 System.out.println(x + " " + y);

    	     }else{
    	    	 System.out.println(y + " " + x);

    	     }
        }

	}
}