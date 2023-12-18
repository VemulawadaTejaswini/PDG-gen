import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,d=0,i=0,n=0,j=0,k=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[][][] office = new int[3][10][4];



    try{
      String line = reader.readLine();
      n = Integer.parseInt(line);
      
      for(i=0;i<n;i++){
        line = reader.readLine();
         String[] splitted = line.split(" ");
         a = Integer.parseInt(splitted[0]);
         b = Integer.parseInt(splitted[1]);
         c = Integer.parseInt(splitted[2]);
         d = Integer.parseInt(splitted[3]);
         office[b-1][c-1][a-1] += d;
      }
		}catch(Exception e){
    }

    for (i = 0; i < 4; i++){
      for (k = 0; k < 3; k++){
        for (j = 0; j < 10; j++){
          try{
            System.out.print(" " + office[k][j][i]);
            }catch(Exception e){
            }
        }
        System.out.print("\n");
      }
      if(i < 3){
        System.out.print("####################\n");
      }
      
    }
	}
}
