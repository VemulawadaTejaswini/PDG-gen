import java.io.*;
import java.util.*;

class Main { 
  public static void main(String[] args) throws java.lang.Exception { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    int[] intArray = Arrays.stream(br.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
    
    int s1 = intArray[0]; 
    int s2 = intArray[1];
    int s3 = intArray[2];
    
    int count = 0;
    if (s1 == 1){
      count++;
    } if(s2 == 1){
      count++;
    } if(s3 == 1){
       count++;
    }
    System.out.println(count);
  }
}