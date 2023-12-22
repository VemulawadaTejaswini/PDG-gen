import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.000000");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		s = new String(in.readLine());
		String[] ss = s.split(" ");
		ArrayList<Integer> is = new ArrayList<Integer>();
		for(int i = 0; i< ss.length;i++){
			is.add(Integer.parseInt(ss[i]));
		}
		int max = -1000000;
		for(Integer i:is){
			if(i > max){
				max = i;
			}
			
		}
		int min = 1000000;
		for(Integer i:is){
			if(i < min){
				min = i;
			}
		}
		long sum = 0;
		for(Integer i:is){
			sum = sum + i;
			
		}
		System.out.println(min+" "+max+" "+sum);
		
	}

}