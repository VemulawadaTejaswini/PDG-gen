import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSequence {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String chain=br.readLine();
		String invertChain="";
		
		for(int i=chain.length()-1; i>=0;i--){
			invertChain = invertChain + chain.charAt(i);
		}
		System.out.print(invertChain);
	}
}