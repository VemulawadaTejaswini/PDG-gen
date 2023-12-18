import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true){
			String[] inputData = br.readLine().split(" ");
			int h = Integer.parseInt(inputData[0]);
			int w = Integer.parseInt(inputData[1]);

			if(h == 0 && w == 0){
				break;
			}
			for(int i = 0; i < h; i ++){
				for(int j = 0; j < w; j ++){
					int count = 0;
					if(i%2 == 0){
						count ++;
					}
					if(j%2 == 0){
						count ++;
					}

					if(count % 2 == 0){
						sb.append("#");
					}else{
						sb.append(".");
					}
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}