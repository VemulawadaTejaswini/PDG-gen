import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
 
 
public class Main{
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()){
    		boolean inited = false;
    		boolean error = false;
    		int cur = 0;
    		int pos = 0;
    		
    		char[] input = sc.next().toCharArray();
    		
    		while(true){
    			//System.out.println(cur);
    			if(error){
    				if(input[pos] == '='){
    					break;
    				}else{
    					pos++;
    					continue;
    				}
    			}
    			
    			if(!inited){
    				if(input[pos] < '0' || input[pos] > '9'){
    					error = true;
    					if(input[pos] == '='){
    						break;
    					}
    					pos++;
    					continue;
    				}
    				
    				int sum = 0;
    				while('0' <= input[pos] && input[pos] <= '9'){
    					sum *= 10;
    					sum += input[pos] - '0';
    					pos++;
    				}
    				
    				cur = sum;
    				inited = true;
    			}else{
    				if(input[pos] == '+'){
    					pos++;
    					
    					int sum = 0;
        				while('0' <= input[pos] && input[pos] <= '9'){
        					sum *= 10;
        					sum += input[pos] - '0';
        					pos++;
        				}
        				
        				cur += sum;
    				}else if(input[pos] == '-'){
    					pos++;
    					
    					int sum = 0;
        				while('0' <= input[pos] && input[pos] <= '9'){
        					sum *= 10;
        					sum += input[pos] - '0';
        					pos++;
        				}
        				
        				cur -= sum;
    				}else if(input[pos] == '*'){
    					pos++;
    					
    					int sum = 0;
        				while('0' <= input[pos] && input[pos] <= '9'){
        					sum *= 10;
        					sum += input[pos] - '0';
        					pos++;
        				}
        				
        				cur *= sum;
    				}else if(input[pos] == '='){
    					break;
    				}
    			}
    			
    			if(cur < 0 || cur >= 10000){
					error = true;
				}
    		}
    		
    		if(error){
    			System.out.println("E");
    		}else{
    			System.out.println(cur);
    		}
    	}
    }
     
}