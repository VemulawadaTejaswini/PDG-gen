import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner kbd = new Scanner(System.in);
	int a = kbd.nextInt();
	int b = kbd.nextInt();
	if(a<b)
	    System.out.println("a < b");
	else if(a>b)
	    System.out.println("a > b");
	else if(a==b)
	    System.out.println("a == b");
    }
}