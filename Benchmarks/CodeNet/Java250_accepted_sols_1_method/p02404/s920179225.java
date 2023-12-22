import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		int h,w;
		String[] str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		while(true){
			str = br.readLine().split(" ");
			h = Integer.parseInt(str[0]);
			w = Integer.parseInt(str[1]);

			if(h==0 && w==0)break;

			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(i != 0 && i != h - 1 && j != 0 && j != w - 1){
						builder.append(".");
					}else{
						builder.append("#");
					}
				}
				builder.append("\n");
			}
			builder.append("\n");
		}
		builder.delete(builder.length() - 1, builder.length());

		System.out.println(builder.toString());
		br.close();
	}
}