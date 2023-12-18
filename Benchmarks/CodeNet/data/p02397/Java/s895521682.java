import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tmp,x,y;
		
		while(true){
			
			String[] str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			
			if(x == 0 && y == 0){
				break;
			}else if (x < y){
				tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x + " " + y);
		}
	}

}