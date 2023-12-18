import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n =new int[10]; 
        int max_1=3;
        int max_2=2;
        int max_3=1;
        for(int i=0;i<10;i++){
        	n[i]=Integer.parseInt(br.readLine());
        	if(n[i]>max_1){
        		max_3=max_2;
        		max_2=max_1;
        		max_1=n[i];        		
        	}
        	else if(n[i]>max_2&&n[i]<max_1){
        		max_3=max_2;
        		max_2=n[i];        		
        	}
        	else if(n[i]>max_3&&n[i]<max_2)max_3=n[i];
        }
        System.out.println(max_1);
        System.out.println(max_2);
        System.out.println(max_3);
    }
}