import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      String[] sArr = in.readLine().split(" ");
      int A = Integer.parseInt(sArr[0]);
      int B = Integer.parseInt(sArr[1]);
      if (A+B >= 10){
        System.out.println("error");
      }else{
        System.out.println(A+B);
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
