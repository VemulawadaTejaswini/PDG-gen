import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int a=Integer.parseInt(scan.next());
    int b=Integer.parseInt(scan.next());

    int d=a/b;
    int r=a%b;
    double f=(double)a/b;

    System.out.println(d+" "+r+" "+String.format("%.5f",f));
  }
}
