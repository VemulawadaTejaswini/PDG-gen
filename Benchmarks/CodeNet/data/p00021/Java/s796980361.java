import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int n = ReadString.readInt();
		for(int i = 0; i < n; i++){
			double[] arr = ReadString.readDoubleArray(8);
			Point p1 = new Point(arr[0], arr[1]);
			Point p2 = new Point(arr[2], arr[3]);
			Point p3 = new Point(arr[4], arr[5]);
			Point p4 = new Point(arr[6], arr[7]);
			System.out.println(katamuki(p1, p2) +" "+ katamuki(p3, p4));
			if(parallel(katamuki(p1, p2) , katamuki(p3, p4)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	static double katamuki(Point p1, Point p2){
		double k = (p2.y-p1.y) / (p2.x-p1.x);
		return k;
	}
	static boolean parallel(double a, double b){
		if(a == b)
			return true;
		else
			return false;
	}
}

class ReadString {
	static int readInt() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		return Integer.parseInt(br.readLine());
	}

	static double[] readDoubleArray(int n) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String c = br.readLine();
		double[] arr = new double[n];

		for(int i = 0; i < n; i++){
			if(c.indexOf(" ") !=  -1){
				String str = c.substring(0, c.indexOf(" "));
				arr[i] = Double.parseDouble(str);
				c = c.substring(c.indexOf(" ")+1);
			}
			else{
				arr[i] = Double.parseDouble(c);
			}
		}
		return arr.clone();
	}
}
class Point{
	public double x;
	public double y;

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
}