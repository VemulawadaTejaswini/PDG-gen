import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String buf;
    	int num;
    	int [] maxNum = new int[100];
    	try{
    		while((buf = br.readLine())!=null)
    		{
    			if(buf.isEmpty()||buf==null)
    				break;
    			num = Integer.parseInt(buf);
    			maxNum[--num]++;
    		}
    	int maxValue =0;
    	for(int i=1;i<=100;i++){
    		if(maxNum[i-1]>maxValue){
    			maxValue=maxNum[i-1];
    		}
    	}
    	for(int i=1;i<=100;i++){
    		if(maxNum[i-1]==maxValue)
    			System.out.println(i);
    	}
    			
    	}catch (Exception e){
    		e.printStackTrace();
    	}
	}
}