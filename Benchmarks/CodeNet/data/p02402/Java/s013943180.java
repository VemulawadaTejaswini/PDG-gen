import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int[] x;
            while ((line = br.readLine()) != null) {
            	int n=Integer.parseInt(line);
            	String[] str=br.readLine().split(" ");
            	
            	x=new int[n];
            	long max=Integer.parseInt(str[0]);
            	long min=Integer.parseInt(str[0]);
            	long sum=0;
            	
            	for(int i=0;i<n;i++){
            		x[i]=Integer.parseInt(str[i]);
            		if(max<x[i]){
            			max=x[i];
            		}
            		if(min>x[i]){
            			min=x[i];
            		}
            		sum+=x[i];
            	}
            	System.out.println(min+" "+max+" "+sum);
            	break;
            }
        }
    }
}