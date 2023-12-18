import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main{

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= null;

	    double max = 0.0;
	    double min = 0.0;
	    double tmp = 0.0;
	    
        while((str = br.readLine()) != null ){

        	tmp = Double.parseDouble(str);

        	if(tmp>max){
        		max=tmp;
        	}
        	else if(tmp<min){
        		min=tmp;
        	}
        }
        System.out.println(max-min);

	}
	

}