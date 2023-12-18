import java.util.Scanner;
import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
 
       String number = read.readLine();
       String[] spli1 = number.split(" ");
       int [] dice = new int [spli1.length];
       int [] dICE = new int [spli1.length];
       int num,count,dcount;
       for(dcount = 0; dcount < spli1.length; dcount++){
    	   dICE[dcount] = 0;
       }
       for(num = 0; num < spli1.length; num++){
        dice[num] = Integer.parseInt(spli1[num]);
       }


       String com = read.readLine();
       char [] command = com.toCharArray();
       
       

       for(count = 0; count < command.length; count++){

            if(count == 0){
                if(command[count] == 'N'){
                	    dICE[count] = dice[1];
                }
                else if(command[count] == 'E'){
                	    dICE[count] = dice[3];
                }
                else if(command[count] == 'S'){
                	    dICE[count] = dice[4];
                }
                else if(command[count] == 'W'){
                	    dICE[count] = dice[2];
                }
            }
            else{
                if(command[count] =='N'){
                    if(dice[count-1] == dice[0]){
                        dICE[count] = dice[1];
                    }
                    else if(dice[count-1] == dice[1] || dice[count-1] == dice[2] || dice[count-1] == dice[3] ){
                        dICE[count] = dice[5];
                    }
                    else if(dice[count-1] == dice[4]){
                    	dICE[count] = dice[0];
                    }
                    else if(dice[count-1] == dice[4]){
                    	dICE[count] = dice[0];
                    }
                    else if(dice[count-1] == dice[5]){
                    	dICE[count] = dice[4];
                    }                   
                }
                else if(command[count] == 'E'){
                    if(dice[count-1] == dice[0] || dice[count-1] == dice[1] || dice[count-1] == dice[4] || dice[count-1] == dice[5]){
                    	dICE[count] = dice[3];
                    }
                     else if(dice[count-1] == dice[2]){
                    	 dICE[count] = dice[1];
                     }
                     else if(dice[count-1] == dice[3]){
                    	 dICE[count] = dice[4];
                     }
                }
                else if(command[count] == 'S'){
                    if(dice[count-1] == dice[0]){
                    	dICE[count] = dice[4];
                    }
                     else if(dice[count-1] == dice[1] || dice[count-1] == dice[2] || dice[count-1] == dice[3]){
                    	 dICE[count] = dice[0];
                    }
                     else if(dice[count-1] == dice[4] || dice[count-1] == dice[5]){
                    	 dICE[count] = dice[2];
                    }
                }
                else if(command[count] == 'W'){
                    if(dice[count-1] == dice[0] || dice[count-1] == dice[1]){
                    	dICE[count] = dice[2];
                    }
                     else if(dice[count-1] == dice[2]){
                    	 dICE[count] = dice[4];
                    }
                     else if(dice[count-1] == dice[3] || dice[count-1] == dice[5]){
                    	 dICE[count] = dice[1];
                    }
                    else if(dice[count-1] == dice[4]){
                    	dICE[count] = dice[5];
                    }
                }
            }
       }
     
       System.out.println(dICE[count-1]);
    }
}