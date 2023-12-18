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
			if(c(i, h, j, w))System.out.print("#");
			else System.out.print(".");
		    }
		    System.out.println();
		}
		System.out.println();
	    }
	}
    }

    static boolean c(int i, int h, int j, int w){
	boolean a = i==h || i==1;
	boolean b = j==w || j==1;
	return a||b;
    }
}