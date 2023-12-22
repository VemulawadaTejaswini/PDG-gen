import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	int x = a.nextInt();
	int y = a.nextInt();
	int n = x;
	if(x < y){
	    x = y;
	    y = n;
	}
	while(y != 0){
	    n = y;
	    y = x%y;
	    x = n;;
	}
	System.out.println(x);
    }
}

