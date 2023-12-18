import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    int c = a+b;
	    int k = 1;
	    //System.out.println(c);
	    while(c >= 10){
		k++;
		c = c/10;
		//System.out.println(c);
  	    }
	    System.out.println(k);
	}
    }
}