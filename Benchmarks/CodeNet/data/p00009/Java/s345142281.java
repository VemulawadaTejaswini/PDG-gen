import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int N,cnt=0;
		
		while(str != null){
			N=Integer.parseInt(str);
			for(int i=1;i<=N;i++){
				if(checkSosu(i)){
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt=0;
			str=br.readLine();
		}

	}
	
	public static boolean checkSosu(int x){
		if(x==0 || x==1){
			return false;
		}else if(x>=2){
			for(int i=2;i<=Math.sqrt(x);i++){
				if(x%i==0){
					return false;
				}
			}
			return true;
		}else{	//x<0?????¨???
			return false;
		}
	}
}