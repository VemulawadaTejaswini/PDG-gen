
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			int m = Integer.parseInt(stdIn.next());
			if(m==0){
				break;
			}
			int[] vm = new int[m];
			for(int i=0;i<m-1;i++){
				vm[i] = Integer.parseInt(stdIn.next());
			}
			int n = Integer.parseInt(stdIn.next());
			int[] vn = new int[n];
			for(int i=0;i<n-1;i++){
				vn[i] = Integer.parseInt(stdIn.next());
			}
			
			double marea = 0;
			double narea = 0;
			for(int i=0;i<m-1;i++){
				marea += Math.sin(Math.toRadians(vm[i]));
			}
			for(int i=0;i<n-1;i++){
				narea += Math.sin(Math.toRadians(vn[i]));
			}

			if(Math.abs(marea-narea)<Math.pow(10,-5)){
				out.println(0);
			}
			else if(marea<narea){
				out.println(2);
			}
			else{
				out.println(1);
			}
			out.flush();
		}
	}
}