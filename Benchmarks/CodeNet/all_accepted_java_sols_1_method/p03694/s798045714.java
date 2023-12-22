import java.io.*;
import java.util.*;
public class Main {
public static void main (String[]args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      String  lines = br.readLine();    

      String[] strs = lines.trim().split("\\s+");
      int [] a = new int [N];
      for (int i = 0; i < strs.length; i++) {
      a[i] = Integer.parseInt(strs[i]);
      sum = Arrays.stream(a).max().getAsInt() - Arrays.stream(a).min().getAsInt();
      }
  
      
 
System.out.println(sum);



    }catch (Exception e) {
       }
       }
   }