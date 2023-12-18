import java.util.*;
public class Main{
    public static void main(String[]args){
	Scanner kbd = new Scanner(System.in);
	while(kbd.hasNext()){
	    int x = kbd.nextInt();
	    int y = kbd.nextInt();
	    if(x!=0 && y!=0){
		if(x>y){
		    int w = x;
		    x = y;
		    y = w;
		    System.out.println(x+" "+y);
		}
		else
		    System.out.println(x+" "+y);
	    }
	}
    }
}