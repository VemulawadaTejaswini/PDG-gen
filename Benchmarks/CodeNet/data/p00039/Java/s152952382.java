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
    			if(i+1 <= num.length()-1){
					if(num.charAt(i+1) == 'M'){
						sum += 500;
						i++;
					}else{
						sum += 500;
					}
    			}else{
    				sum += 500;
    			}
    		}else if(num.charAt(i) == 'C'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'M'){
    					sum += 900;
    					i++;
    				}else if(num.charAt(i+1) == 'D'){
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
    				if(num.charAt(i+1) == 'M'){
    					sum += 990;
    					i++;
    				}else if(num.charAt(i+1) == 'D'){
    					sum += 490;
    					i++;
    				}else if(num.charAt(i+1) == 'C'){
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
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'M'){
    					sum += 950;
    					i++;
    				}else if(num.charAt(i+1) == 'D'){
    					sum += 450;
    					i++;
    				}else if(num.charAt(i+1) == 'C'){
    					sum += 50;
    					i++;
    				}else{
    					sum += 50;
    				}
    			}else{
    				sum += 50;
    			}
    		}else if(num.charAt(i) == 'V'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'M'){
    					sum += 995;
    					i++;
    				}else if(num.charAt(i+1) == 'D'){
    					sum += 495;
    					i++;
    				}else if(num.charAt(i+1) == 'C'){
    					sum += 95;
    					i++;
    				}else if(num.charAt(i+1) == 'L'){
    					sum += 45;
    					i++;
    				}else if(num.charAt(i+1) == 'X'){
    					sum += 5;
    					i++;
    				}else{
    					sum += 5;
    				}
    			}else{
    				sum += 5;
    			}
    		}else if(num.charAt(i) == 'I'){
    			if(i+1 <= num.length()-1){
    				if(num.charAt(i+1) == 'M'){
    					sum += 999;
    					i++;
    				}else if(num.charAt(i+1) == 'D'){
    					sum += 499;
    					i++;
    				}else if(num.charAt(i+1) == 'C'){
    					sum += 99;
    					i++;
    				}else if(num.charAt(i+1) == 'L'){
    					sum += 49;
    					i++;
    				}else if(num.charAt(i+1) == 'X'){
    					sum += 9;
    					i++;
    				}else if(num.charAt(i+1) == 'V'){
        					sum += 4;
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