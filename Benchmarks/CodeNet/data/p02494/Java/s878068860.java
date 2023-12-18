import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	while(kbd.hasNext()){
	    int h = kbd.nextInt();
	    int w = kbd.nextInt();
	    if(!(h==0 && w==0)){
		for(int i=h; i>0; i--){
		    for(int j=w; j>0; j--){
			System.out.print("#");
		    }
		    System.out.println();
		}
	    }
	    System.out.println();
	}
    }
}