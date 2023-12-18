import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        while(line != null){
        double[] a = new double[6];
        int startIndex = 0;
        int endIndex = line.indexOf(" ");

        for(int i=0; i<6; i++){
        	a[i] = readNum(line, startIndex, endIndex);

        	startIndex = endIndex+1;
        	endIndex = line.indexOf(" ", startIndex);
        	if(endIndex==-1){endIndex=line.length();}
        }

        double x = (a[2]*a[4]-a[1]*a[5])/(a[0]*a[4]-a[1]*a[3]);
        double y = (a[0]*a[5]-a[2]*a[3])/(a[0]*a[4]-a[1]*a[3]);

        x = Math.round(x*1000)/1000.0;
        y = Math.round(y*1000)/1000.0;

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println(df.format(x)+" "+df.format(y));

        line = br.readLine();
        }
        br.close();
    }

    static double readNum(String line, int startIndex, int endIndex){
		return Double.parseDouble(line.substring(startIndex, endIndex));
    }
}