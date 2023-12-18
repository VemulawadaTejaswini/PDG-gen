import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = new String(in.readLine());
    int N = Integer.parseInt(s);
    int sumN = 0;
    
    for(int i = 0; i < s.length(); i++){
      sumN += Character.getNumericValue(s.charAt(i));
    }
    
    if(N % sumN == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
