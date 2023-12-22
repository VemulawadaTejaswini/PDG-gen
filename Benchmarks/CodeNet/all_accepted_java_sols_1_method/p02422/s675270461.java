import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    StringBuilder sb=new StringBuilder(scan.next());
    int q=Integer.parseInt(scan.next());

    for(int i=0;i<q;i++){
      String order=scan.next();
      int a=Integer.parseInt(scan.next());
      int b=Integer.parseInt(scan.next());

      if(order.equals("print")){
        System.out.println(sb.substring(a,b+1));
      }else if(order.equals("replace")){
        String replaceStr=scan.next();
        sb.replace(a,b+1,replaceStr);
      }else if(order.equals("reverse")){
        StringBuilder buf=new StringBuilder(sb.substring(a,b+1));
        buf.reverse();
        sb.replace(a,b+1,buf.toString());
      }
    }
  }
}

