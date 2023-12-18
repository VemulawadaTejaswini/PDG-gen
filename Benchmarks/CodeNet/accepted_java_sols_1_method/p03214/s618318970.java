
import java.util.*;
import java.io.*;
public class Main {
	
	static int[] flame;
	static int n = 0;;
	static double ave = 0;
	
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Integer.parseInt(br.readLine());
			flame = new int[n];
			flame = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		double sum = 0;
		
		for (int a : flame) {
			sum += a;
		}
		ave = sum / n;
		
		double[] aves = Arrays.stream(flame).mapToDouble(a -> Math.abs(ave - a)).toArray();
		
		int index = 0;
		for (int i=0; i<aves.length; i++) {
			if(aves[i] < aves[index] && aves[i] != aves[index]) index = i; 
		}
		
		System.out.println(index);
	}

}
