import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main{

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
        String str;

	    double max = 0.0;
	    double min = 0.0;
	    double tmp = 0.0;
	    
        while((str = br.readLine()) != null ){
    	tmp = Double.parseDouble(str);
//        for (int j=0;j<5;j++){
//        	tmp = Double.parseDouble(br.readLine());

        	if(i==0){
        		max = tmp;
        		min = tmp;
        	}
        	
        	if(tmp>max){
        		max=tmp;
        	}
        	else if(tmp<min){
        		min=tmp;
        	}
        	i++;
        }
        System.out.println(max-min);

	}
	

}