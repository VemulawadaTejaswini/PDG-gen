import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        boolean bPrime[] = new boolean[1000000];
        int pNum,num;
        String buf;
        
        Arrays.fill(bPrime,true);
        bPrime[0] = false;
        bPrime[1] = false;
       
        for(int i = 2;i < bPrime.length;i++){  
        	 
        	for(int j=2*i;j<bPrime.length;j+=i)
        		bPrime[j] = false;	
        }
     
        while((buf= br.readLine())!=null)
        {
        	num = Integer.parseInt(buf);
        	pNum = 0;
        	for(int i=2;i<=num;i++){
        		if(bPrime[i])
        			pNum++;
        	}
        	System.out.println(pNum);
        }
	}
}