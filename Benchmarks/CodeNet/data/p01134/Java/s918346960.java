import java.util.*;
import java.awt.geom.Line2D;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    int[][] c = new int[n][4];
	    for(int i=0; i<n; i++){
		for(int j=0; j<4; j++){
		    c[i][j] = sc.nextInt();
		}
	    }

	    int ans = 2;
	    List<Double> xlist = new ArrayList<Double>();
	    List<Double> ylist = new ArrayList<Double>();
	    for(int i=1; i<n; i++){
		xlist = new ArrayList<Double>();
		ylist = new ArrayList<Double>();
		boolean boo = true;
		Line2D a = new Line2D.Double(c[i][0],c[i][1],c[i][2],c[i][3]);
		for(int j=0; j<i; j++){
		    Line2D b = new Line2D.Double(c[j][0],c[j][1],c[j][2],c[j][3]);

		    if(a.intersectsLine(b)
		       && !((c[i][0]==c[j][0]&&c[i][1]==c[j][1]) || (c[i][2]==c[j][2]&&c[i][3]==c[j][3]) || (c[i][0]==c[j][2]&&c[i][1]==c[j][3]) || (c[i][2]==c[j][0]&&c[i][3]==c[j][1]))){
			double bx = c[j][2]-c[j][0];
			double by = c[j][3]-c[j][1];
			double d1 = Math.abs(bx*(c[i][1]-c[j][1])-by*(c[i][0]-c[j][0]));
			double d2 = Math.abs(bx*(c[i][3]-c[j][1])-by*(c[i][2]-c[j][0]));
			double t = d1/(d1+d2);

			double x = c[i][0]+(c[i][2]-c[i][0])*t;
			double y = c[i][1]+(c[i][3]-c[i][1])*t;
			if(xlist.contains(x) && ylist.contains(y)){continue;}
			else{xlist.add(x); ylist.add(y);}
			if(boo){ans+=2; boo = false;}
			else ans++;
		    }
		}
		if(boo){ans++;}
	    }

	    System.out.println(ans);
	    n = sc.nextInt();
	}
    }
}