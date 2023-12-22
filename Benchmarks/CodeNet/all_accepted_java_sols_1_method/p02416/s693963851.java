import java.io.*;
 
class Main{
    public static void main(String[] args)throws IOException{
		long sum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			sum = 0;
			String inp = br.readLine();
			if(inp.equals("0")){
				break;
			}
			char[] ch = inp.toCharArray();
			for(char c : ch){
				sum += Character.getNumericValue(c);
			}
			System.out.println(sum);
		}
    }
}