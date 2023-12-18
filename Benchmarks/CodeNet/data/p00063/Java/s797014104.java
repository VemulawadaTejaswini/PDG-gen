import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PalindromeCounter pc = new PalindromeCounter();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			pc.setString(str);
		}
		
		System.out.println(pc.getCount());

	}

}

class PalindromeCounter{
	int count = 0;
	
	public void setString(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString())){
			count++;
		}
	}
	
	public int getCount(){
		return count;
	}
}