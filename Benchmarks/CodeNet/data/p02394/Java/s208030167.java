import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();

        if(x>0 && x<W)
        	if(y>0 && y<H)
        		if(x+r<=W && x-r>=0)
        			if(y+r<=H && y-r>=0){
        				System.out.println("Yes");
        				return;
        			}

        System.out.println("No");
    }
}