import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] str = new String[n];
    boolean flag = true;

    for(int i = 0; i < n; i++){
      str[i] = scan.next();
      if(i > 0 && (str[i-1].charAt(str[i-1].length()-1) != str[i].charAt(0))){
        flag = false;
      }
    }

    if(flag == true){
      Arrays.sort(str);
      for(int i = 0; i < n-1; i++){
        if(str[i].equals(str[i+1])){
          flag = false;
          break;
        }
      }
    }

    if(flag == true)
      System.out.println("Yes");
    else
    System.out.println("No");

  }
}
