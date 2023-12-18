import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);

        int num,count;
        
        while(true){
        	num = Integer.parseInt(read.readLine());
        	if(num == 0){
        		break;
        	}
        	else{
        		double sum = 0;
                double ave = 0;
                double sum2 = 0;
                double a2 = 0;
                double deviation = 0;
        		
        		String line = read.readLine();    
        		String [] spli = line.split(" ");
        		double [] x = new double [num];
        		
        		for(count = 0; count < num; count++){
        			x[count] = Double.parseDouble(spli[count]);
        			sum = sum + x[count];     			
        		}  
        		ave = sum/num;
        		for(count = 0; count < num; count++){
        			sum2 = sum2 + (ave-x[count])*(ave-x[count]);
        		}
        		a2 = sum2/num;
        		deviation = Math.sqrt(a2);
        		System.out.println(deviation);
        	}	
        }
    }
}