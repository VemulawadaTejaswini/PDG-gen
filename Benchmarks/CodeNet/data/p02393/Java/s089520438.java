/*AOJ-ITP-2-2*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int[] sort =  {a,b,c}; 
		int v=0;
		
		if(!(a >= 1 || b >= 1 || c >= 1 || a <= 10000 || b <= 10000 || c <= 10000)){System.exit(1);}
		
		for(int i = 1 ; i < sort.length ; i++){
			if(sort[i-1] > sort[i]){
				v = sort[i-1];
				sort[i-1] = sort[i];
				sort[i] = v;
			}
		}
		
		for(int i = 1 ; i < sort.length ; i++){
			if(sort[i-1] > sort[i]){
				v = sort[i-1];
				sort[i-1] = sort[i];
				sort[i] = v;
			}
		}
		
		System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
		
	}
}