import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		boolean ans = true;
		int px = 0, py = 0, pt = 0;
		for(int i = 0; i < N; i++){
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int dist = Math.abs(x - px) + Math.abs(y - py);
			
			if(t - pt < dist || (t - pt - dist) % 2 != 0){
				ans = false;
				break;
			}else{
				px = x;
				py = y;
				pt = t;
			}
		}
		
		System.out.println(ans ? "Yes" : "No");
	}
}
