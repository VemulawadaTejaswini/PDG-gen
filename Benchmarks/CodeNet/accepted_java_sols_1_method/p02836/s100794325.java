import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      String ss=s.nextLine();
      int i=0,j=ss.length()-1;
      int re=0;
      while(i<j){
      	if(ss.charAt(i)!=ss.charAt(j)){re++;}
      	i++;j--;
      }
      System.out.println(re);
      	
      }
        }
    
