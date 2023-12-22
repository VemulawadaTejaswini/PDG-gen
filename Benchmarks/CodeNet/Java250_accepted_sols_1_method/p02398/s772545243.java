import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    int a=Integer.parseInt(scan.next());
    int b=Integer.parseInt(scan.next());
    int c=Integer.parseInt(scan.next());
    int count=0;

    for(int i=1;i<=c;i++){
      if( (c%i==0) && (a<=i) && (i<=b)){
        count++;
      }
    }
    System.out.println(count);
  }
}
