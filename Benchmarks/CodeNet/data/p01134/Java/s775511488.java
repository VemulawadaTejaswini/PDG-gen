import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			Line2D.Double[] k = new Line2D.Double[n];
			int count = 1;
			for(int i=0;i<n;i++){
				k[i] = new Line2D.Double(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				for(int j=i-1;j>=0;j--){
					if(k[i].intersectsLine(k[j])==true) count++;
				}
				count++;
			}
			System.out.println(count);
		}	
	}	
}