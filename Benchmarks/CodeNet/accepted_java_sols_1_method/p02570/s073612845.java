import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
      		long D = sc.nextInt(),T = sc.nextInt(),S = sc.nextInt();
      		if ((D-T*S)>0){
              System.out.println("No");
            }else{
              System.out.println("Yes");
            }
      
              
    }
}