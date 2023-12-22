import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		double[] b = {48.00,51.00,54.00,57.00,60.00,64.00,69.00,75.00,81.00,91.00};
		String[] c={"light fly","fly","bantam","feather","light","light welter","welter","light middle","middle","light heavy","heavy"};
		while((t=bf.readLine())!=null){
			double w=Double.parseDouble(t);
			int i;
			for(i=0;i<10;i++)if(w<=b[i])break;
			System.out.println(c[i]);
		}
	}
}