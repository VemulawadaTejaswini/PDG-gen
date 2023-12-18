import java.io.*;
import java.util.*;
public class Main {
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
   
    int N = Integer.parseInt(br.readLine());
    String res = "";

    if((N%10 == 2)||(N%10 == 4)||(N%10 == 5)||(N%10 == 7)||(N%10 == 9)) {
        res = "hon";
    }
    else if((N%10 == 0) || (N%10 == 1) || (N%10 == 6) || (N%10==8)) {
        res = "pon";
    } 
    else{
        res = "bon";
    }
    System.out.println(res);
 


       
    }catch (Exception e) {
       }
       }
   }