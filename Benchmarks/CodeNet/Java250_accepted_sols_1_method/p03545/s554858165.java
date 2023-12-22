import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int num = (int)s.charAt(0) - 48;
      	int nums[] = new int[3];
      	int sum = num;
    	char[] ops = {'+','+','+'};
      	boolean con = true;
		
      	for(int i = 0;i < 3;i++){
          nums[i] = (int)s.charAt(i+1) - 48;
          sum += nums[i];
        }
     
      	for(int i = 0; i < 2 && con;i++){
          	if(i == 1){
            	ops[0] = '-';
              	nums[0] = Math.abs(nums[0]) * (-1);
            } else {
                ops[0] = '+';
              	nums[0] = Math.abs(nums[0]);
                }
        	for(int j = 0; j < 2 && con;j++){
              	if(j == 1){
            		ops[1] = '-';
              		nums[1] = Math.abs(nums[1]) * (-1);
            	} else {
                  	ops[1] = '+';
              		nums[1] = Math.abs(nums[1]);
                }
            	for(int k = 0;k < 2 && con;k++){
   					if(k == 1){
            			ops[2] = '-';
              			nums[2] = Math.abs(nums[2]) * (-1);
            		} else {
            			ops[2] = '+';
              			nums[2] = Math.abs(nums[2]);
            		}
                 	sum = num + nums[0] + nums[1] + nums[2];
                 	if(sum == 7) con = false;
                }
            }
        }
      	
      	System.out.print(num);
      	for(int i = 0;i < 3;i++){
          System.out.print(ops[i]);
          System.out.print(Math.abs(nums[i]));
        }
      	System.out.println("=7");
	}
}
