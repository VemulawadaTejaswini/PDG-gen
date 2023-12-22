import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int i,sum;
			while(true){
				str = br.readLine();
				if(str.equals("0")) break;
				for( i=0, sum=0; i<str.length(); i++ ){
					sum += Integer.parseInt(""+str.charAt(i));
				}
				System.out.println(sum);
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}