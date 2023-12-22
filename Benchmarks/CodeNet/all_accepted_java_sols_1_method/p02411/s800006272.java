import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		while(true){
			String str = br.readLine();
			String[] s = str.split(" ");

			int shiken1 = Integer.parseInt(s[0]);
			int shiken2 = Integer.parseInt(s[1]);
			int saishiken = Integer.parseInt(s[2]);

			int sum = shiken1 + shiken2;

			if((shiken1 == -1)&&(shiken2 == -1)&&(saishiken == -1)){
				break;
			}
			if((shiken1 == -1)||(shiken2 == -1)){
				System.out.println("F");
				continue;
			}else if(80 <= sum){
				System.out.println("A");
				continue;
			}else if((65 <= sum)&&(sum <= 79)){
				System.out.println("B");
				continue;
			}else if((50 <= sum)&&(sum <= 64)||(50 <= saishiken)){
				System.out.println("C");
				continue;
			}else if((30 <= sum)&&(sum <= 49)){
				System.out.println("D");
				continue;
			}else if(sum <= 29){
				System.out.println("F");
				continue;
			}
		}
	}
}