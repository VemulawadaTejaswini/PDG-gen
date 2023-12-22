import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    String strary[] = new String[6];
	    double x[] = new double[3];
	    double y[] = new double[3];
	    int count = Integer.parseInt(br.readLine());
	    double c[] = new double[10]; // keisan you
	    double a,b,r;
	    while((count--) != 0){
		str = br.readLine();
		strary = str.split(" ");
		int tmp = 0;
		for (int i = 0; i < 3; i++) {
		    x[i] = Double.parseDouble(strary[tmp]);
		    y[i] = Double.parseDouble(strary[tmp+1]);
		    tmp+=2;
		}
		c[0] = 2*(x[1]-x[0]);
		c[1] = 2*(y[1]-y[0]);
		c[2] = x[0]*x[0]-x[1]*x[1]+y[0]*y[0]-y[1]*y[1];
		c[3] = 2*(x[2]-x[0]);
		c[4] = 2*(y[2]-y[0]);
		c[5] = x[0]*x[0]-x[2]*x[2]+y[0]*y[0]-y[2]*y[2];
		a = (c[1]*c[5]-c[4]*c[2])/(c[0]*c[4]-c[3]*c[1]);
		b = (c[2]*c[3]-c[5]*c[0])/(c[0]*c[4]-c[3]*c[1]);
		r = Math.sqrt((x[0]-a)*(x[0]-a)+(y[0]-b)*(y[0]-b));
		System.out.printf("%.3f %.3f %.3f\n",a,b,r);
	    }
	}
	catch(Exception e){
	    System.out.println("error");
	    System.exit(0);
	}
    }
}