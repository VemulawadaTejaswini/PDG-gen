import java.util.Scanner;
import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
 
       String number = read.readLine();
       String[] spli1 = number.split(" ");
       int [] dice = new int [6];
       int [] dICE = new int [8];
       int dcount,num,count;
       for(dcount = 0; dcount < 8; dcount++){ 
    	   dICE[dcount] = 0;
       }
       for(num = 0; num < 6; num++){
    	   dICE[num] = Integer.parseInt(spli1[num]); 
       }


       String com = read.readLine();
       char [] command = com.toCharArray();
       
       

       for(count = 0; count < command.length; count++){

                if(command[count] =='N'){
                	dICE[6] = dICE[0];
                	dICE[7] = dICE[4];
                	dICE[0] = dICE[1];
                	dICE[1] = dICE[5];
                	dICE[2] = dICE[2];
                	dICE[3] = dICE[3];
                	dICE[4] = dICE[6];
                	dICE[5] = dICE[7];                         
                }
                else if(command[count] == 'E'){
                	dICE[6] = dICE[0];
                	dICE[7] = dICE[2];
                	dICE[0] = dICE[3];
                	dICE[1] = dICE[1];
                	dICE[2] = dICE[6];
                	dICE[3] = dICE[5];
                	dICE[4] = dICE[4];
                	dICE[5] = dICE[7];       
                }
                else if(command[count] == 'S'){
                	dICE[6] = dICE[0];
                	dICE[7] = dICE[5];
                	dICE[0] = dICE[4];
                	dICE[1] = dICE[6];
                	dICE[2] = dICE[2];
                	dICE[3] = dICE[3];
                	dICE[4] = dICE[5];
                	dICE[5] = dICE[1];     
                }
                else if(command[count] == 'W'){
                	dICE[6] = dICE[0];
                	dICE[7] = dICE[3];
                	dICE[0] = dICE[2];
                	dICE[1] = dICE[1];
                	dICE[2] = dICE[5];
                	dICE[3] = dICE[6];
                	dICE[4] = dICE[4];
                	dICE[5] = dICE[7];     
                
            }
       }
       System.out.println(dICE[0]);
    }
}