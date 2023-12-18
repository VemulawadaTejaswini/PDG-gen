import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main { 
	public static void main(String[] args) throws Exception { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] trump = new int[n];
		int i = 0;
		String line;
		for(int u = 0 ; u < n ;u++){
			line = in.readLine();
			trump[i] = Integer.parseInt(line);
			i++;
		}
		
		boolean isok = true;
		
		for(int j = 0 ; j < n ; j++){
			if(trump[j] < 10){
				if(j == 0){
					isok = false;
				}else{
					for(int k = j - 1 ; k >= 0 ; k--){
						if(trump[k] >= (j-k+1)*10){
							isok = true;
						}else{
							isok = false;
						}
						
					}
				}
			}
		}
		if(isok){
		int[] trumpreturn = new int[n];
		for(int y = 0 ; y < n ; y++){
			trumpreturn[y] = trump[n-y-1];
		}
		for(int j = 0 ; j < n ; j++){
			if(trumpreturn[j] < 10){
				if(j == 0){
					isok = false;
//					break;
				}else{
					for(int k = j - 1 ; k >= 0 ; k--){
						if(trumpreturn[k] >= (j-k+1)*10){
							isok = true;
						}else{
							isok = false;
//							break;
						}
						
					}
				}
			}
		}}
		
		
		String judge;
		if(isok){
			judge = "yes";
		}else{
			judge = "no";
		}
		
			System.out.println(judge);
	}
} 
