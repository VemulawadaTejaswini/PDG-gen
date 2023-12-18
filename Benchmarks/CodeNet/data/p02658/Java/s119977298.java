import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
            //Long[] num = new Long[n];
            Long res = 1L;
            
            
	        for(int i = 0; i<n; i++) {
              Long num =sc.nextLong();
              if(num==0){
            	  res *= 0;
            	  break;
              }else {
              if(res * num <= ((long)Math.pow(10, 18))) {
            	res *= num;
              }else  {
            	  res = -1L;
            	  break;
              }
            }
	        }
          
	        
            System.out.println(res); 
	        
	}
}

