import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			double d[] = new double[4];
			String s = br.readLine();
			String[] a = s.split(" ");
			for(int i = 0;i < 4;i++)
				d[i] = Double.parseDouble(a[i]);
			double dis = Math.sqrt((d[2]-d[0])*(d[2]-d[0])+(d[3]-d[1])*(d[3]-d[1]));
			System.out.printf("%5.5f", dis);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}