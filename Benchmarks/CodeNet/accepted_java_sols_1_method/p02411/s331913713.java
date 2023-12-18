import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
                     
                       while(str != null){
                       String[] strs = str.split("\\s");
                       int m = Integer.parseInt(strs[0]);
                       int f = Integer.parseInt(strs[1]);
                       int r = Integer.parseInt(strs[2]);
                         
                       if(m==-1 && f ==-1 && r==-1){
                           break;
                       }
                     
                       if(m+f < 30 || m==-1 || f==-1){
                           System.out.println("F");
                       }else if(m+f < 50){
                           if(r >= 50){
                               System.out.println("C");
                            }else{
                               System.out.println("D");
                           }
                       }else if(m+f < 65){
                           System.out.println("C");
                       }else if(m+f < 80){
                           System.out.println("B");
                       }else{
                           System.out.println("A");
                       }
                       str = br.readLine(); 
 
                        }
                     
                   br.close();
 
  }
}