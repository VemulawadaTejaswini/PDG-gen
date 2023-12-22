import java.util.*;
import java.io.*;

public class Main{
    public static void main(String Args[])throws IOException{
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      int result = 0;

      if((input%2) != 0){
        result = input/2;
      }else{
        result = input/2 -1;
      }
      
      System.out.println(result);
      sc.close();
    }
}