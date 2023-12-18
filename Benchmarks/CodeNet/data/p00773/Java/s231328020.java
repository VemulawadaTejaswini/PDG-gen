
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			double x=in.nextInt(),y=in.nextInt(),s=in.nextInt();
			if(x==0)break;
			int max=0;
			for(double i=1;i<=s;i++) {
				for(double j=1;j<s=;j++) {
					if((int)(i*((100+x)/100))+(int)(j*((100+x)/100))==s) {
						//System.out.println(i*((100+y)/100)+j*((100+y)/100));
						max=Math.max(max, (int)((i*((100+y)/100))+(int)(j*((100+y)/100))));
					}
				}
			}
			
			System.out.println(max);
		}
	}

}

