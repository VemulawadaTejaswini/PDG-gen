import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String chain=br.readLine();
		String invertChain="";
		
		if(chain.length()<20){
			for(int i=chain.length()-1; i>=0;i--){
				invertChain = invertChain + chain.charAt(i);
			}
		}else
			System.out.print("Character Chain to big");
		System.out.print(invertChain);
	}

}