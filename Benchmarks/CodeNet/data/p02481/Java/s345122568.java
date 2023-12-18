import java.io.*;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int in1 = Integer.parseInt(br1.readLine());
		int in2 = Integer.parseInt(br1.readLine());
				
		int x = RectArea(in1, in2);
		int y = Circumference(in1, in2);
		
		System.out.println(x + " " + y);
		
		br1.close();
		br2.close();
	}
	public static int  RectArea(int a, int b){
		return a * b;
	} 
	public static int Circumference(int a, int b){
		return (2 *a) + (2 * b);
	}

}