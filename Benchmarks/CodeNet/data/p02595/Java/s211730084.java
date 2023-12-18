import java.io.*;
import java.util.*;

class Main{
 
  public static void main(String args[]){
    
    Scanner s= new Scanner(System.in);
    
    int n =s.nextInt();
    float d = s.nextInt();
    int count=0;
    
    for(int i=0;i<n;i++){
     if(Math.sqrt(Math.pow(s.nextInt(),2)+Math.pow(s.nextInt(),2))<=d)
       count++;
    }
    System.out.println(count);
    
  }
  
}