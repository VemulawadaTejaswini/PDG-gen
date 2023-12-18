import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long x1 = (long)Math.ceil(Math.sqrt((double)S));
		long y1 = 0;
		long x2 = 1;
		long y2 = x1;
		long x3 = 0;
		long y3 = 0;
		long tmp = x1*y2;
		y1 = tmp-S;
		//S = Math.abs((x1*y2)-(x2*y1));
		if(y1<0){
			y2 -= y1;
			y3 = -y1;
      y1 = 0;
		}
    System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
	}
}