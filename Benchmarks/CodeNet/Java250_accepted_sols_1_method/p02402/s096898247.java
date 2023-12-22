import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		String data[] = reader.readLine().split(" ");
		int[] ints = new int[num];
		for(int i=0; i<num; i++){
			ints[i] = Integer.parseInt(data[i]);
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		long sum=0;
		
		for(int i : ints){
			if(max<i)
				max=i;
			if(min>i)
				min=i;
			sum+=i;
		}
		
		System.out.println(Integer.toString(min)+" "+Integer.toString(max)+" "+Long.toString(sum));
		
	}
}