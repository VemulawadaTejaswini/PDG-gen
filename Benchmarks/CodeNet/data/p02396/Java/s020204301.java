import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
	public static void main(String[] args){
	int i = 1;
	//int[] x = new int[10000];
	int x =0;
		while(i>0){
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			String line;
			x = Integer.parseInt(line);
			
			
			
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
		}
	}
}