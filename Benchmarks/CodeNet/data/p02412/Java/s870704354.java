import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,s=0,sum=0;
            boolean end=false;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0 0"))break;
            	String[] str=line.split(" ");
            	n=Integer.parseInt(str[0]);
            	s=Integer.parseInt(str[1]);
            	for(int i=n;i>0;i--){
            		for(int j=n-1;j>0;j--){
            			end=true;
            			for(int k=n-2;k>0;k--){
            				if(i==j||j==k||k==i)continue;
                    		if(i+j+k==s){
                    			sum++;
                    		}
                    		if(i+j+k>=s){
                    			end=false;
                    		}
                    	}
            			if(end){
            				break;
            			}
                	}
            		if(end){
            			break;
            		}
            	}
            	System.out.println(sum);
            }
        }
    }

}