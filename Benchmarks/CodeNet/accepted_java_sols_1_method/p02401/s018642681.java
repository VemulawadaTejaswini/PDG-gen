import java.io.*;
import java.lang.Math;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] a=new int[1000];
    String[] op=new String[1000];
    int[] b=new int[1000];
    int count=0;
    for(int i=0;i<a.length;i++){
      a[i]=Integer.parseInt(scan.next());
      op[i]=scan.next();
      b[i]=Integer.parseInt(scan.next());

      if(op[i].equals("?")){
        break;
      }
      count++;
    }

    for(int i=0;i<count;i++){

      if(op[i].equals("+")){
        int ans=a[i]+b[i];
        System.out.println(ans);
      }else if(op[i].equals("-")){
        int ans=a[i]-b[i];
        System.out.println(ans);
      }else if(op[i].equals("*")){
        int ans=a[i]*b[i];
        System.out.println(ans);
      }else if(op[i].equals("/")){
        int ans=a[i]/b[i];
        System.out.println(ans);
      }

    }
  }
}
