import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while (!in.readLine().equals("0")) {
            String[] tmp = in.readLine().split(" ");
            int n = tmp.length;
            double[] s = new double[n];
            
            for (int i=0; i<n; i++) {
                s[i] = Double.parseDouble(tmp[i]);
            }
            
            double m = mean(s);
            
            for (int i=0; i<n; i++) {
                s[i] = Math.pow(s[i] - m, 2);
            }
            
            double a = Math.sqrt(sum(s)/n);
            
            System.out.printf("%.5f\n", a);
        }
	}
    
    public static double sum (double[] s) {
        double sum = 0;
        
        for (int i=0; i<s.length; i++) {
            sum += s[i];
        }
        
        return sum;
    }
    
    public static double mean (double[] s) {
        return sum(s) / s.length;
    }
}