import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			StringBuffer sb = new StringBuffer();
			sb.append("^.*[");
			
			for(int i = 0; i<K; i++){
				sb.append(scan.nextInt());
				sb.append("|");
			}

			sb.deleteCharAt(sb.length()-1);
			sb.append("].*$");
			
			String regex = sb.toString();
			
			while(true){
				if(Integer.toString(N).matches(regex) == false){
					System.out.println(N);
					return;
				}
				
				N++;
			}
		}
	}
}
