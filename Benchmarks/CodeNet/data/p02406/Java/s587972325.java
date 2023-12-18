import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++){
			
			int x = i;
			
			if(x%3 == 0){
				sb.append(" "+i);
			}else{
				while(x!=0){
					if(x%10 == 3){
						sb.append(" "+ i);
						break;
					}else{
						x = x/10;
					}
				}
			}
		}
		System.out.println(sb);
	}

}