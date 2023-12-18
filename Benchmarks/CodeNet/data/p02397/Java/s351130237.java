import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] strs;
		int x;
		int y;
		int w;
		while(true){
			str = br.readLine();
			strs = str.split(" ");
			x = Integer.parseInt(strs[0]);
			y = Integer.parseInt(strs[1]);
			if(x == 0 && y == 0){
				break;
			}else if(x > y){
				w = y;
				y = x;
				x = w;
			}//if
			System.out.println(x + " " + y);
		}//while
	}
}