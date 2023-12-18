import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, e, f;
    double x, y;

    void run(){
	while(sc.hasNext()){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    d = sc.nextInt();
	    e = sc.nextInt();
	    f = sc.nextInt();

	    x = (double)(c*e-b*f)/(a*e-b*d);
	    y = (double)(a*f-c*d)/(a*e-b*d);
	    if(x==(-0.0)) x = Math.abs(x);
	    if(y==(-0.0)) y = Math.abs(y);
	    System.out.println(x+" "+y);
	}
    }
}