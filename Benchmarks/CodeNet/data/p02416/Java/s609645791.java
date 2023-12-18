import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum;
		
		String s = br.readLine();
		
		while(Long.parseLong(s)!=0L){
			sum = 0;
			for(int i=0; i<s.length(); i++){
				sum += Character.getNumericValue(s.charAt(i));
			}
			System.out.println(sum);
			s = br.readLine();
		}
		
		br.close();
	}
}