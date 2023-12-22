import java.io.*;

class Main {

	public static void main(String args[]) throws IOException {
		String str;
		int len,sum;
        BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			str = br.readLine();
			len = str.length();
			sum=0;
			
			if(str.equals("0"))break;
			
			for(int i=0;i<len;i++){
				sum += Integer.parseInt(str.charAt(i) + "");
			}
			
			System.out.println(sum);
		}
	}

}