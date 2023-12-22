import java.io.*;
 
class Main {
    	public static void main(String[] args) throws IOException {
        	double x1, y1, x2, y2;
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] str = br.readLine().split(" ");
	        x1 = Double.parseDouble(str[0]);
	        y1 = Double.parseDouble(str[1]);
	        x2 = Double.parseDouble(str[2]);
	        y2 = Double.parseDouble(str[3]);
	        System.out.println(Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2)));
    	}
}