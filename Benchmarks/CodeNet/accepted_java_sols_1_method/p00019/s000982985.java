import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	long b = 1;

	for(int i = 1 ; i <= a ; i++){
	    b = b*i;
	}
	System.out.println(b);
    }
}