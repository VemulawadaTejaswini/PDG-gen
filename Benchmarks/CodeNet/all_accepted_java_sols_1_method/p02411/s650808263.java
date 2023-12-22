import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    while(true){
      int m=Integer.parseInt(scan.next());
      int f=Integer.parseInt(scan.next());
      int r=Integer.parseInt(scan.next());
      if(m==-1 && f==-1 && r==-1)break;
      if((m==-1 || f==-1) || (m+f)<30){
        System.out.println('F');
      }else if((m+f)>=30 && (m+f)<50){
        if(r>=50){
          System.out.println('C');
        }else{
          System.out.println('D');
        }
      }else if((m+f)>=50 && (m+f)<65){
        System.out.println('C');
      }else if((m+f)>=65 && (m+f)<80){
        System.out.println('B');
      }else{
        System.out.println('A');
      }
    }
  }
}
