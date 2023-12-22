import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
		int count = Integer.parseInt(br.readLine());
		if(count == 0) break;
		
		String str[] = new String[count];
		str = br.readLine().split(" ");
		double[] s = new double[count];
		double sum = 0;
		for(int i = 0;i<count;i++){
			s[i] = Double.parseDouble(str[i]);
			sum += s[i];
		}
		double average = (double) sum/count;
		double SUM = 0;
		for(int i = 0;i<count;i++){
			SUM += Math.pow(s[i]-average,2);
		}
		double SUM1 = (double) SUM/count;
		System.out.println(Math.sqrt(SUM1));
		}
	}
}