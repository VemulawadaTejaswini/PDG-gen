import java.io.*;
import java.util.*;


class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int[] r = new int[t];
    int diff = -2147483648;
    
    for(int i = 0; i < t; i++){
      r[i] = Integer.parseInt(br.readLine());
      if(i != 0){
        for(int j = 0; j < i; j++){
          if(diff < r[i] - r[j]){
            diff = r[i] - r[j];
          }
        }
      }
    }

    System.out.println(diff);
  }
}