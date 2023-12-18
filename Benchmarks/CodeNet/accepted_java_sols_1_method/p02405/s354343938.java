import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  while(true){
				  //????????\???
			     String ab = input.readLine();
		         String []strAry = ab.split(" ");
		         int  a=Integer.parseInt(strAry[0]);
	             int b=Integer.parseInt(strAry[1]);
	             int count=0;
	             int countb=0;
	              if(a==0&&b==0){
	        	      break;
	               }
	                  //a?????°?????????
	                  for(int i=0; i<a; i++){
	                	  //count??§?\???°?????¶??°??????????????????
	                	  count++;
	                	  //count????\???°??????
	                	  if(count%2!=0){
	        	             for(int j=0; j<b; j++){
	        	            	 //countb??§?????????????´?????\???°?????¶??°???????????????
	        	        	      countb++;
	        	        	      //countb????\???°??????
	        	        	      if(countb%2!=0){
	        	        		      System.out.print('#');
	        	        		  //countb?????¶??°??????
	        	        	      }else{
	        	        		      System.out.print('.');
	        	        	      }

	        	               }
	        	             //count?????¶??°??????
	                        }else{
	                        	 for(int j=0; j<b; j++){
	        	        	      countb++;
	        	        	      if(countb%2!=0){
	        	        		      System.out.print('.');
	        	        	      }else{
	        	        		      System.out.print('#');
	        	        	      }

	                        	 }

	                         }


                      countb=0;
	                  System.out.println("");
	              }
	                  System.out.println("");
			  }

		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}//60
}