import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
	Scanner in = new Scanner(System.in);

	int W = in.nextInt();
	int H = in.nextInt();
	int x = in.nextInt();
	int y = in.nextInt();
	int r = in.nextInt();

	if(0<=x-r && 0<=y-r && y+r<=H && x+r<= H){
	    System.out.println("Yes");

	}else System.out.println("No");

    }
}

