import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int nm = sc.nextInt();
			int ng = sc.nextInt();
			int ngg = sc.nextInt();
			int nd = sc.nextInt();
			int nggg = sc.nextInt();
			int no = sc.nextInt();
			
			if(nm + ng + ngg + nd + nggg + no == 0) break;
			
			int count = 0;
			while(true) {
				if((nm != 0 || nd != 0) && (ng != 0 || nggg != 0) && (ngg != 0 || no != 0)) {
					if(nm != 0) nm--;
					else nd--;
					if(ng != 0) ng--;
					else nggg--;
					if(ngg != 0) ngg--;
					else no--;
					count++;
				}
				else if(nm + nd >= 3) {
					if(nm >= 3) nm -=3;
					else if(nd >= 3) nd-=3;
					else {
						nd = 0;
						nm = 0;
					}
					count++;
				}
				else if(ng + nggg >= 3) {
					if(ng >= 3) ng -=3;
					else if(nggg >= 3) nggg-=3;
					else {
						ng = 0;
						nggg = 0;
					}
					count++;
				}
				else if(ngg + no >= 3) {
					if(ngg >= 3) ngg -=3;
					else if(no >= 3) no-=3;
					else {
						ngg = 0;
						no = 0;
					}
					count++;
				}
				else break;
			}
			System.out.println(count);
 		}
	}	
}