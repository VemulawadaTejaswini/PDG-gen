import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true){
			String string [] = bufferedReader.readLine().split(" ");	
			if (string[0] == "0" && string[1] == "0" ) {
				break;
			}
			Integer H = Integer.parseInt(string[0]);
			Integer K = Integer.parseInt(string[1]);
			
			for(int i = 0; i < H; i++){
				for (int j = 0; j < K; j++){
					if(i == 0 || i == H - 1|| j == 0 || j == K - 1){
						sb.append("#");
					}else{
						sb.append(".");
					}
					
				}sb.append("\n");
				
			}sb.append("\n");
			System.out.println(sb);
		}
		
		
	}
}