import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0;
            int[] store=null;
            
            while ((line = br.readLine()) != null) {
            	n=Integer.parseInt(line);
            	store=new int[n];
            	for(int i=0;i<n;i++){
            		store[i]=Integer.parseInt(br.readLine());
            	}
            	int max=store[1]-store[0];
            	for(int i=0;i<n;i++){
            		for(int j=i+1;j<n;j++){
                		if(store[j]-store[i]>max){
                			max=store[j]-store[i];
                		}
                	}
            	}
            	System.out.println(max);
            	break;
            }
        }
    }

}