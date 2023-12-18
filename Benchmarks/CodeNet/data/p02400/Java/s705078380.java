import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args){
		BufferedReader br = null;
		try{
			br = new BufferedReader (new InputStreamReader(System.in));
			double d = new Double(br.readLine());
			double s = Math.pow(d,2) *Math.PI;
			double r = 2 * d * Math.PI;
			System.out.println(s+" "+r);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br !=null)br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}