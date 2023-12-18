import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String result = br.readLine();

			int slen = str.length();
			int rlen = result.length();
			int j = 0;
			for(int i = 0; i < slen; i++){
				if(str.charAt(i) == result.charAt(0)){
					int count = i;
					for(j = 0; j < rlen; j++){
						count = (i + j) % slen;
						if(str.charAt(count) != result.charAt(j)){
							break;
						}
					}
				}
				if(rlen == j){
					break;
				}
			}
			if(rlen == j){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		}catch(IOException e){
			System.err.println(e);
		}
	}
}