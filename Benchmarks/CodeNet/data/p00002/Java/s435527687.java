import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try{
			while((line = br.readLine() ) != null){
				String[] sl = line.split(" ");
				int a = (int) Math.log10(Integer.parseInt(sl[0]));
				int b = (int) Math.log10(Integer.parseInt(sl[1]));
				System.out.println(a+b);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}