import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
    	Scanner sc = new Scanner(System.in);

    	int x = sc.nextInt();
    	int y = sc.nextInt();

    	if(y>x) {
    		int tmp = x;
    		x = y;
    		y = tmp;
    	}

    	int a = 0;

    	if(x != y) {
	    	int z = x%y;

	    	a = z;

	    	while(true) {
	    		if(y%a==0 && z%a==0) {
	    			break;
	    		}
	    		a--;
	    	}
    	}else {
    		a = x;
    	}

    	System.out.println(a);

    	sc.close();
    }
}
