import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    /* f(x) = x*x */
    int d;
    int i;
    int h;
    int sum;

    void run(){
	while(sc.hasNext()){
	    sum = 0;
	    d = sc.nextInt();
	    i = d;
	    h = i*i;
	    while(i<600){
		sum += h*d;
		i = i+d;
		h = i*i;
	    }
	    System.out.println(sum);
	}
    }
}