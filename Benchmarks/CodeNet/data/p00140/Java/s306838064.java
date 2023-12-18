import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataSetNum = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < dataSetNum ; i++){
			String[] startEnd = br.readLine().split(" ");
			int start = Integer.parseInt(startEnd[0]);
			int end = Integer.parseInt(startEnd[1]);
			StringBuffer sb = new StringBuffer();
			if((start >= 6 && end >= 6) && (start > end)){
				for(int y = start ; y != end + 1 ; y++){
					if(y > 9){
						y = 4;
					}else{
						sb.append(y);
						sb.append(" ");
					}
				}
				System.out.println(sb.toString().trim());
			}else if(start >= 6 && end <= 5){
				for(int y = start ; y <= 9 ; y++){
					sb.append(y);
					sb.append(" ");
				}
				for(int x = 5 ; end <= x ; x-- ){
					sb.append(x);
					sb.append(" ");
				}
				System.out.println(sb.toString().trim());
			}else if(start > end){
				for(int y = start ; y >= end ; y--){
					sb.append(y);
					sb.append(" ");
				}
				System.out.println(sb.toString().trim());
			}else{
				for(int y = start ; y <= end ; y++){
					sb.append(y);
					sb.append(" ");
				}
				System.out.println(sb.toString().trim());
			}
		}
	}

}