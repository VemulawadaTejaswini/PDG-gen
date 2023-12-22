import java.util.*;

public class Main {
    private static Scanner sc;
    static int w;
    static int h;
    static int x;
    static int y;
    static int r;
    

	public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	w = sc.nextInt();
    	h = sc.nextInt();
    	x = sc.nextInt();
    	y = sc.nextInt();
    	r = sc.nextInt();
    	if (x-r<0||x+r>w ||y-r<0||y+r>h){
    		System.out.println("No");
    	}else{
    		System.out.println("Yes");
    	}
    }
}
    	