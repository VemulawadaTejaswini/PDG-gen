import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
        	String num = input.nextLine();
        	System.out.println(roman(num));
        }
    }

    public static int roman(String num){
    	int sum = 0;
    	for(int i = 0 ; i < num.length() ; i++){
    		if(num.charAt(i) == 'M'){
    			sum += 1000;
    		}else if(num.charAt(i) == 'D'){
    			sum += 500;
    		}else if(num.charAt(i) == 'C'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'D'){
    					sum += 400;
    					i++;
    				}else{
    					sum += 100;
    				}
    			}else{
    				sum += 100;
    			}
    		}else if(num.charAt(i) == 'X'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'C'){
    					sum += 90;
    					i++;
    				}else if(num.charAt(i+1) == 'L'){
    					sum += 40;
    					i++;
    				}else{
    					sum += 10;
    				}
    			}else{
    				sum += 10;
    			}
    		}else if(num.charAt(i) == 'L'){
    			sum += 50;
    		}else if(num.charAt(i) == 'V'){
    			sum += 5;
    		}else if(num.charAt(i) == 'I'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'V'){
    					sum += 4;
    					i++;
    				}else if(num.charAt(i+1) == 'X'){
    					sum += 9;
    					i++;
    				}else{
    					sum += 1;
    				}
    			}else{
    				sum += 1;
    			}
    		}
    	}
    	return sum;
    }
}