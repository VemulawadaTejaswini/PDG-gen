import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int x=Integer.parseInt(scan.next());
    int y=Integer.parseInt(scan.next());
    if(x<y){
      int tmp=x;
      x=y;
      y=tmp;
    }
    while(y>0){
      int r=x%y;
      x=y;
      y=r;
    }

    System.out.println(x);
  }
}

