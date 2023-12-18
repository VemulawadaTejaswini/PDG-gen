import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;


public class Main {
	public static final double SQRT3 = Math.sqrt(3);
	public static final DecimalFormat df = new DecimalFormat("0.0000");

	double[] tmp = new double[8];
	
	public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine());
        
        double[] kc = kochCurve(n);
        
        for (int i=0; i<kc.length/2; i++) {
        	out.print(df.format(kc[i*2]));
        	out.print(' ');
        	out.println(df.format(kc[i*2+1]));
        }
        out.flush();
    }
    
    private double[] kochCurve(int n) {
    	double[] nextkc = new double[((int)Math.pow(2, 2*n)+1)*2];
    	double[] kc = null;
    	if(n==0) {
    		nextkc[2] = 100;
    	} else {
    		kc = kochCurve(n-1);
        	for(int i=0; i<kc.length-2; i+=2) {
        		kochCurveSub(kc[i],kc[i+1],kc[i+2],kc[i+3],nextkc,i*4);
        	}
        	nextkc[nextkc.length-1] = kc[kc.length-1];
        	nextkc[nextkc.length-2] = kc[kc.length-2];
    	}
    	return nextkc;
    }
    
    private void kochCurveSub(double sx, double sy, double ex, double ey, double[] nextkc, int ptr) {
    	nextkc[ptr+0] = sx;
    	nextkc[ptr+1] = sy;
    	if(sy==0 && ey==0){
        	double dx1 = (ex-sx)/3;
        	double dx2 = dx1/2;
        	double dy2 = dx1*SQRT3/2;
        	nextkc[ptr+2] = sx + dx1;
        	nextkc[ptr+4] = nextkc[ptr+2] + dx2;
        	nextkc[ptr+5] = dy2;
        	nextkc[ptr+6] = ex - dx1;
    	}else{
        	double dx1 = (ex-sx)/3;
        	double dy1 = (ey-sy)/3;
        	double dx2 = (dx1 - dy1*SQRT3)/2;
        	double dy2 = (dx1*SQRT3 + dy1)/2;
        	nextkc[ptr+2] = sx + dx1;
        	nextkc[ptr+3] = sy + dy1;
        	nextkc[ptr+4] = nextkc[ptr+2] + dx2;
        	nextkc[ptr+5] = nextkc[ptr+3] + dy2;
        	nextkc[ptr+6] = ex - dx1;
        	nextkc[ptr+7] = ey - dy1;
    	}
    }
    
}