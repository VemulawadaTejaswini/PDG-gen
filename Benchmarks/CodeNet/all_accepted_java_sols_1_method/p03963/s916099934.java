import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int balls = in.nextInt(), color = in.nextInt();
		int res=color;
		for(int i=2; i<=balls; i++) {
			res*=color-1;
		}
		System.out.print(res);
		in.close();
	}
}