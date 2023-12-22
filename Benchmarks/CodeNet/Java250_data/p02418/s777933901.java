import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     String p = scanner.nextLine();
     String sss = s + s + s;
     if(sss.contains(p)){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }

  }
}

