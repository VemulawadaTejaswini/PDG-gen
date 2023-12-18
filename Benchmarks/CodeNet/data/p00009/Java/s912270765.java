import java.io.*;

public class Main{

	public static int prime[] = new int[1000];
	private static int primeCnt = 0;
	
	public static void main(String[] args) throws IOException{
	
	try{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        while( (str = br.readLine() ) != null ){
        	System.out.printf("%d\n",countPrime(Integer.parseInt(str)));
        }
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	
	private static boolean isPrime(int n){
			
		if(n==2){
			prime[0] = 2;
			primeCnt++;
			return true;
		}
		
		for(int i = 0; i < prime.length ; i++) {
			if(n%prime[i] == 0){
				return false;
			}
			if(prime[i+1]==0) break;
		}
		prime[primeCnt] = n;
		primeCnt++;
		return true;
	}
	
	private static int countPrime(int n){
		int count = 0;
		for(int i = 2; i <= n; i++){
			if( isPrime(i) )count++;
		}
		return count;
	}
	
}