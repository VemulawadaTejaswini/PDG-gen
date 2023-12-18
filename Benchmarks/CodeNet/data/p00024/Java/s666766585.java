import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double v=in.nextDouble();
			double t=v/9.8;
			double y=4.9*t*t;
			int ans=(int)(y+5)/5+1;
			System.out.println(ans);
		}
		in.close();
	}
}