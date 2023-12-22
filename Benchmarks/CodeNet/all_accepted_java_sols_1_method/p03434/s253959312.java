import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); 
        
        boolean odd = false;
        
        
        String str = br.readLine();
        String boxstr[] = str.split(" ");
        int box[] = new int[n+1];
        box[n] = 0;
        for(int i = 0;i<n;i++){
        box[i] = Integer.parseInt(boxstr[i]);
        box[i] = -box[i];
   //     System.out.println(box[i]);
     //   
        }
        Arrays.sort(box);
        
        for(int i = 0 ;i<n+1;i++){
 //       	System.out.print(box[i]+" ");
        }
        

        int sum1 = 0;
        int sum2 = 0;
        int box1[] = new int [n+1/2];
    	int box2[] = new int[n+1/2];
        for(int i = 0;i<n+1/2;i+=2){
        	box1[i] = box[i];
        	box2[i] = box[i+1];
        	
        //	System.out.println(box1[i]+"-"+box2[i]);
        	sum1 += box1[i];
        	sum2 += box2[i];
        }
        System.out.println(-(sum1-sum2));
        
        
        
        
        
        
	}
}