import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,n=0,j=0,m=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    try{
      String line = reader.readLine();
      n = Integer.parseInt(line);
      int bar[] = new int[n];
      for(i=0;i<n;i++){
        bar[i] = i + 1;
      }
      
      line = reader.readLine();
      j = Integer.parseInt(line);
      for(i=0;i<j;i++){
        line = reader.readLine();
        String[] splitted = line.split(",");
        a = Integer.parseInt(splitted[0]);
        b = Integer.parseInt(splitted[1]);
        c = bar[a - 1];
        bar[a - 1] = bar[b - 1];
        bar[b - 1] = c;

      }
      
      for(i=0;i<n;i++){
        System.out.println(bar[i]);
      }
      
      





		}catch(Exception e){
    }




  
	}
}
