import java.io.*;

public class Main{
public static void main(String[] args){
try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");

	int W = Integer.parseInt(str[0]);
	int H = Integer.parseInt(str[1]);
	int x = Integer.parseInt(str[2]);
	int y = Integer.parseInt(str[3]);
	int r = Integer.parseInt(str[4]);
		
		if( -100 <= x && x <= 100 && -100 <= y && y<= 100){
			if(0 <= W && W <= 100 && 0 <= H && H <= 100 && 0 <= r && r<= 100){
			int circle_max_X = x + r;
			int circle_min_X = x - r;
			int circle_max_Y = y + r;
			int circle_min_Y = y - r;

				if (circle_max_X <= W && circle_min_X >= 0 && circle_max_Y <= H && circle_min_Y >= 0){
				System.out.println("Yes");
				}else{
				System.out.println("No");
				}
			}else{
			System.out.println("Input Error");
			}
	}else{
	System.out.println("Input Error");
	}
}catch(IOException e){
System.out.println(e);
}
}
}