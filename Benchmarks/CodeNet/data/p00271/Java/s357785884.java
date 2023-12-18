import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int max, min;

    void run(){
	while(sc.hasNext()){
	    max = sc.nextInt();
	    min = sc.nextInt();
	    System.out.println(max-min);
	}
    }
}