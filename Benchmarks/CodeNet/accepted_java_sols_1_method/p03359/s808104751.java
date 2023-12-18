import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int a,b;
      a= Integer.parseInt(sc.next());
      b= Integer.parseInt(sc.next());

      if(a<=b){
        System.out.println(a);
      }else{
        System.out.println(a-1);
      }

    }
    catch (Exception e) {

    }
  }
}
