import java.io.*;
import java.util.*;
public class Main{
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
    int k = Integer.parseInt(br.readLine());
    String res = br.readLine();
String newRes  = "";
    if(res.length()>k) {
    newRes = res.substring(0, k) + "...";
    }
    else{
        newRes = res;
    }
System.out.println(newRes);

       
    }catch (Exception e) {
       }
       }
   }