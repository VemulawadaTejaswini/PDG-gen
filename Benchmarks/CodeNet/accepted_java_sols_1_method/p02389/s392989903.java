import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    int a=Integer.parseInt(scan.next());
    int b=Integer.parseInt(scan.next());

    int s=a*b;
    int l=2*a+2*b;

    System.out.println(s+" "+l);
  }
}
