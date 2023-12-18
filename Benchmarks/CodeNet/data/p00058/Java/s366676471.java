import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double ep = 0.0;
	while(s.hasNext()) {
	    double[] d = new double[8];
	    for(int i=0 ; i<8 ; i++)
		d[i] = s.nextDouble();
	    double a = (d[3]-d[1])*(d[7]-d[5]) + (d[2]-d[0])*(d[6]-d[4]);
	    String ans;
	    if(a == 0)
		ans = "YES";
	    else
		ans = "NO";
	    }
	    System.out.println(ans);
	}
    }
}