import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
	int a,b;

	while(true){
	    a = s.nextInt();
	    b = s.nextInt();
	    if(a == 0 && b == 0)break;
	    if(a>b)System.out.println(b+" "+a);
	    else System.out.println(a+" "+b);
	}
    }
}