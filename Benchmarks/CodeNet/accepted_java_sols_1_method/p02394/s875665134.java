import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int W=in.nextInt(),H=in.nextInt(),x=in.nextInt(),y=in.nextInt(),r=in.nextInt();
		
		if((x+r<=W && x-r>=0) && (y+r<=H && y-r>=0))System.out.println("Yes");
		else System.out.println("No");
	}

}

