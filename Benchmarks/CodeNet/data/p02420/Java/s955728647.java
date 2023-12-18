import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    int num, h = 0;
    String str = "", front = "", back = "";

    while(true){
      str = in.next();
      if(str.equals("-"))  break;
      num = in.nextInt();
      for(int i = 0; i < num; i++){
        h = in.nextInt();
        back = str.substring(0,h);
        front = str.substring(h);
        str = front + back;
      }
      System.out.println(str);
    }
  }
}

