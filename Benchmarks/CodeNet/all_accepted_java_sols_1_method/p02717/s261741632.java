import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int w = 0;
        
        w = y;
        y = x;
        x = w;
        
        w = z;
        z = x;
        x = w;
        
		System.out.println(x+" "+y+" "+z);
	    scan.close();	

    }
}