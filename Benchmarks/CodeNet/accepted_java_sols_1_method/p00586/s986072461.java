import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    System.out.println(a+b);
	}
    }
}