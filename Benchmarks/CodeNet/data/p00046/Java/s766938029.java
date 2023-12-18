import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO ?????????????????????????????????????????????
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		double[] a = new double[num];
		double max,min;
		
		for(int i = 0 ; i < a.length ;i++){
			a[i] = Double.parseDouble(br.readLine());
		}
		max = a[0]; min = a[0];
		for(int i = 0 ; i < a.length ; i++){
			max = Math.max(max, a[i]);
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.println(max-min);
		
	}

}