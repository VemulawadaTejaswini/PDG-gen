import java.util.*;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    
    public static void main(String[] args) {	
	int n;
	while(kbd.hasNext()) {
	    n = kbd.nextInt();
	    if(n != 0)
		solve(n);
	}
    }

    static void solve(int n) {
	int x,max, min, i=n, point=0;
	x = kbd.nextInt();
	point += x;
	max = x;
	min = x;
	i--;
	while(i>0) {
	    x = kbd.nextInt();
	    point += x;
	    if(x > max) max = x;
	    if(x < min) min = x;
	    i--;
	}
	point = point - max - min;
	System.out.println(point/(n-2));
    }
}