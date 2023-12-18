import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int N;
		
		while(str != null){
			N=Integer.parseInt(str);
			System.out.println(sosuCount(N));
			str=br.readLine();
		}

	}
	
	//n??\???????´???°?????°?????????
	public static int sosuCount(int n){
		if(n==1){
			return 0;
		} else if(n==2){
			return 1;
		} else if(n>2){
			for(int i=2;i<n;i++){
				if(n%i==0){
					return sosuCount(n-1);
				}
			}
			return sosuCount(n-1)+1;
		} else{
			return -1;
		}
	}

}