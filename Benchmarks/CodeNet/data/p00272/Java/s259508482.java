import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] price = {0, 6000, 4000, 3000, 2000};
    int t, n;

    void run(){
	while(sc.hasNext()){
	    t = sc.nextInt();
	    n = sc.nextInt();
	    System.out.println(price[t] * n);
	}
    }
}