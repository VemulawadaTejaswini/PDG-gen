import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int xmax = 0;
		int xmin = 1000000000;
		int ymax = 0;
		int ymin = 1000000000;
		int xmaxin=-1;
		int xminin=-1;
		int ymaxin=-1;
		int yminin=-1;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(x[i]>xmax) {
				xmax = x[i];
				xmaxin = i;
			}
			if(x[i]<xmin) {
				xmin = x[i];
				xminin = i;
			}
			if(y[i]>ymax) {
				ymax = y[i];
				ymaxin = i;
			}
			if(y[i]<ymin) {
				ymin = y[i];
				yminin = i;
			}
		}
		int ans = 0;
		if(xmax-xmin>ymax-ymin) ans = Math.abs(x[ymaxin]-x[yminin])+ymax-ymin;
		else ans = Math.abs(y[xmaxin]-y[xminin])+xmax-xmin;
		System.out.println(ans);
	}
}