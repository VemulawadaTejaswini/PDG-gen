import java.io.*;

public class Main {
	public static void main(String[] a) {
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		System.out.println((int)Math.pow(i,3));
	
		br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}