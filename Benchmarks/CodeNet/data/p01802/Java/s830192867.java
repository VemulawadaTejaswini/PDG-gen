import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int D=in.nextInt(),C=in.nextInt();
			if(D==0)break;
			
			double min=(double)10000000;
			for(int i=0;i<=D;i++){
				double x=(double)(D-i),y=(double)i;
				
				double diff=Math.abs(Math.sqrt((x*x)+(y*y))-(double)C);
				//System.out.println(x+" "+y+" "+diff);
				min=Math.min(min, diff);
			}
			System.out.printf("%.10f\n",min);
		}
	}

}

