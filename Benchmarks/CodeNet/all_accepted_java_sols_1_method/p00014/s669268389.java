import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int d = sc.nextInt(), s = 0;
	    for(int i = d; i <= 600-d; i+=d) s += (d*i*i);
	    System.out.println(Integer.toString(s));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}