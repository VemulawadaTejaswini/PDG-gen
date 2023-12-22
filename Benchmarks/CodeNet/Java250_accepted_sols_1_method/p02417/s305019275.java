import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] countList = new int[alpha.length];

		String str;
		while((str = br.readLine())!= null){
			char[] input = str.toLowerCase().toCharArray();
			for(int i=0; i<input.length;i++){
				for(int j=0;j<alpha.length;j++){
					if(input[i]==alpha[j]){
						countList[j] +=1;
					}
				}
			}
		}

		for(int i=0;i<alpha.length;i++){
			System.out.println(alpha[i] + " : " + countList[i]);
		}
	}
}