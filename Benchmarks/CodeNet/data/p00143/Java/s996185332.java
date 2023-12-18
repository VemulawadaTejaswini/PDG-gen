import java.awt.geom.Line2D;
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i < n; i++){
			int [][] tri = new int [4][2];
			for(int j=0; j < 3; j++){
				tri[j][0] = sc.nextInt();
				tri[j][1] = sc.nextInt();
			}
			tri[3][0] = tri[0][0];
			tri[3][1] = tri[0][1];
			int manX = sc.nextInt();
			int manY = sc.nextInt();
			int womanX = sc.nextInt();
			int womanY = sc.nextInt();
			Line2D.Double mAndw = new Line2D.Double(manX, manY, womanX, womanY);
			int intersectCount = 0;
			for(int j=0; j < 3; j++){
				Line2D.Double triLine = new Line2D.Double(tri[j][0], tri[j][1], tri[j+1][0], tri[j+1][1]);
				boolean result = mAndw.intersectsLine(triLine);
				if(result)
					intersectCount++;
			}
			if((intersectCount & 1) == 0)
				System.out.println("NG");
			else
				System.out.println("OK");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}