import java.util.*;

public class Main{
    public static void main(String args[]){ 

	Scanner scn = new Scanner(System.in);
	int H = scn.nextInt();
	int W = scn.nextInt();
    int h = scn.nextInt();
  	int w = scn.nextInt();

      System.out.print((H*W)-((w*H)+(h*W)-(w*h)));

    }
}