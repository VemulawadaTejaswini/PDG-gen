import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			HashSet<String> dictionary = new HashSet<String>();
			int N = Integer.parseInt(br.readLine());
			for(int i=0;i<N;i++){
				String line = br.readLine();
				String[] temp = line.split(" ");
				String op = temp[0];
				String word = temp[1];
				switch(op){
				case "insert":
					dictionary.add(word);
					break;
				case "find":
					if(dictionary.contains(word)){
						System.out.println("yes");
					}else{						
						System.out.println("no");
					}
					break;
				}
			}
		}
	}
}