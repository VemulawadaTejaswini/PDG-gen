import java.io.*;
import java.util.*;

class Main{

  final static int MAX=3000;

  public static void main(String[] args)throws java.lang.Exception {
    Scanner scan=new Scanner(System.in);
    while(true){
      int x=Integer.parseInt(scan.next());
      int y=Integer.parseInt(scan.next());
      if(x==0 && y==0)break;
      System.out.println(Math.min(x,y)+" "+Math.max(x,y));
    }
  }
}
