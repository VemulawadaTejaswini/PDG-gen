import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		char[] linearr;
		//String[] linearr;
		int i, l, sum;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.toCharArray();
				//line.split(""); ... ????????§?????§??????
				sum = 0;
				if(Character.getNumericValue(linearr[0]) == 0
					//Integer.parseInt(linearr[0]) == 0
				){
					return;
				}
				for(i=0, l=line.length(); i<l; i++){
					sum += Character.getNumericValue(linearr[i]);
					//sum += Integer.parseInt(linearr[i]);
				}
				System.out.println(sum);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}