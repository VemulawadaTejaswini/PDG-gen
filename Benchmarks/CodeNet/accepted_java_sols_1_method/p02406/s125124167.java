import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String line = br.readLine();
		int n =  Integer.parseInt(line);
		int i = 0;
		for(int j=3; j<=n; j++){
			if(j % 3 ==0){
				sb.append(" ").append(j);
			}
			else{
				i = j;
				while(i != 0){
					if(i % 10 == 3){
						sb.append(" ").append(j);
						break;
					}
					else{
						i = i / 10;
					}
				}
			}
		}
		System.out.println(sb);
	}
}