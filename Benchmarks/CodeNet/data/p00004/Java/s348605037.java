import java.io.IOException;
import java.util.StringTokenizer;

class SimultaneousEquation {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			while(true){
				String s = in.readLine();
				StringTokenizer st = new StringTokenizer(s);
				float a = Float.parseFloat(st.nextToken());
				float b = Float.parseFloat(st.nextToken());
				float c = Float.parseFloat(st.nextToken());
				float d = Float.parseFloat(st.nextToken());
				float e = Float.parseFloat(st.nextToken());
				float f = Float.parseFloat(st.nextToken());
				float x = (b * f - e * c) / (d * b - a * e);
				float y = (f - (d * x)) / e;
				System.out.println("x : " + x + "y : " + y);
			}
		}catch(Exception e){
			System.exit(0);
		}
	}

}