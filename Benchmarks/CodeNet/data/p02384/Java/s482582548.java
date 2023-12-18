import java.io.*;
 class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);         
  
       String number = read.readLine();
       String[] spli1 = number.split(" ");
       int [] dice = new int [8];
       int dcount,num,count;

       for(dcount = 0; dcount < 8; dcount++){ 
         dice[dcount] = 0;
       }

       for(num = 0; num < 6; num++){
         dice[num] = Integer.parseInt(spli1[num]); 
       }

       int limit = Integer.parseInt(read.readLine()); 

       for(count = 0; count < limit; count++){

          String com = read.readLine();
          String[] comm = com.split(" ");
          int [] command = new int [2];
          for(num = 0; num < 2; num++){
            command[num] = Integer.parseInt(comm[num]); 
          }
      
            while(true){
              if(dice[0] == command[0] && dice[1] == command[1]){
              break;
              }
              else if(dice[1] != command[1]){
                if(command[1] == dice[0]){
                  dice[6] = dice[0];
                  dice[7] = dice[1];
                  dice[0] = dice[4];
                  dice[1] = dice[6];
                  dice[2] = dice[2];
                  dice[3] = dice[3];
                  dice[4] = dice[5];
                  dice[5] = dice[7];
                }
                else if(command[1] == dice[2]){
                	dice[6] = dice[0];
                    dice[7] = dice[3];
                    dice[0] = dice[2];
                    dice[1] = dice[1];
                    dice[2] = dice[5];
                    dice[3] = dice[6];
                    dice[4] = dice[4];
                    dice[5] = dice[7];
                    dice[6] = dice[0];
                    dice[7] = dice[1];
                    dice[0] = dice[4];
                    dice[1] = dice[6];
                    dice[2] = dice[2];
                    dice[3] = dice[3];
                    dice[4] = dice[5];
                    dice[5] = dice[7];     
                }
                else if(command[1] == dice[3]){
                  dice[6] = dice[0];
                  dice[7] = dice[2];
                  dice[0] = dice[3];
                  dice[1] = dice[1];
                  dice[2] = dice[6];
                  dice[3] = dice[5];
                  dice[4] = dice[4];
                  dice[5] = dice[7];
                  dice[6] = dice[0];
                  dice[7] = dice[1];
                  dice[0] = dice[4];
                  dice[1] = dice[6];
                  dice[2] = dice[2];
                  dice[3] = dice[3];
                  dice[4] = dice[5];
                  dice[5] = dice[7];   
                }
                else if(command[1] == dice[4]){
                  dice[6] = dice[0];
                  dice[7] = dice[1];
                  dice[0] = dice[5];
                  dice[1] = dice[4];
                  dice[2] = dice[2];
                  dice[3] = dice[3];
                  dice[4] = dice[7];
                  dice[5] = dice[6];
                }
                else if(command[1] == dice[5]){
                  dice[6] = dice[0];
                  dice[7] = dice[4];
                  dice[0] = dice[1];
                  dice[1] = dice[5];
                  dice[2] = dice[2];
                  dice[3] = dice[3];
                  dice[4] = dice[6];
                  dice[5] = dice[7];  
                }
              }
              else if(dice[1] == command[1] && dice[0] != command[0]){
                if(command[0] == dice[2]){
                  dice[6] = dice[0];
                  dice[7] = dice[3];
                  dice[0] = dice[2];
                  dice[1] = dice[1];
                  dice[2] = dice[5];
                  dice[3] = dice[6];
                  dice[4] = dice[4];
                  dice[5] = dice[7];  
                }
                else if(command[0] == dice[3]){
                  dice[6] = dice[0];
                  dice[7] = dice[2];
                  dice[0] = dice[3];
                  dice[1] = dice[1];
                  dice[2] = dice[6];
                  dice[3] = dice[5];
                  dice[4] = dice[4];
                  dice[5] = dice[7];   
                }
                else if(command[0] == dice[5]){
                  dice[6] = dice[0];
                  dice[7] = dice[2];
                  dice[0] = dice[3];
                  dice[1] = dice[1];
                  dice[2] = dice[6];
                  dice[3] = dice[5];
                  dice[4] = dice[4];
                  dice[5] = dice[7];     
                  dice[6] = dice[0];
                  dice[7] = dice[2];
                  dice[0] = dice[3];
                  dice[1] = dice[1];
                  dice[2] = dice[6];
                  dice[3] = dice[5];
                  dice[4] = dice[4];
                  dice[5] = dice[7];       
                }
                else{
                break;
                }
              }        
            }
            System.out.println(dice[2]);
        }       
    }
}