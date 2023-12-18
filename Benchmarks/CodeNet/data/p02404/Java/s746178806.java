import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String[] line = br.readLine().split(" ");
			
			int h = Integer.parseInt(line[0]);
			int w = Integer.parseInt(line[1]);
			
			if(h == 0 && w == 0){
				break;
			}
			
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if((0 < i && i <h-1) && (0 < j && j < w-1)){
						sb.append(".");
					}
					else {
						sb.append("#");
					}
				}
				sb.append("\n");
			}
			sb.append("\n");
			System.out.print(sb);
			sb.delete(0,sb.length());
		}
	}
}