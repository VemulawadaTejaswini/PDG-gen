import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int hanakoPoint=0;
    int tarouPoint=0;
    for(int i=0;i<n;i++){
      String hanakoCard=scan.next();
      String tarouCard=scan.next();
      int judge=hanakoCard.compareTo(tarouCard);
      if(judge<0){
        hanakoPoint+=3;
      }else if(judge>0){
        tarouPoint+=3;
      }else{
        hanakoPoint++;
        tarouPoint++;
      }
    }

    System.out.println(tarouPoint+" "+hanakoPoint);
  }
}
