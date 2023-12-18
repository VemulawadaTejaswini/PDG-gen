import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		
		while(true){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str =  br.readLine();
		if(str==null)break;
		int n = Integer.parseInt(str);
		
		int count = 0;
		if(n > 1) count++;
		for(int i = 3; i < n+1; i = i + 2){
			boolean f = true;
			for(int j = 2; j < i; j++){
				if(i%j == 0)f = false;
			}
			if(f) count++;
		}
		System.out.println(count);
	}

}
}