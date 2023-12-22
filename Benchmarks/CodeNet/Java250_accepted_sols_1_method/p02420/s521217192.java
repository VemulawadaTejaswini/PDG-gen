import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    while(true){
      String S=sc.next();
      //System.out.println(S);
      if(S.equals("-")){
        break;
      }else{
      char[] c = S.toCharArray();
      int m = sc.nextInt();
      for(int i=0;i<m;i++){
      int h= sc.nextInt();
        for(int j=0;j<h;j++){
          char[] temp = new char[h];
          temp[j] = c[0];
          //System.out.println(temp[j]);
          for(int k=1;k<c.length;k++){
            c[k-1]=c[k];
            //System.out.print(c[k]);
          }
          c[c.length-1]=temp[j];
          //System.out.println(c[c.length-1]);
      }
      }
       for(int l=0;l<c.length;l++){
       System.out.print(c[l]);
      }
      System.out.println();
     }
  }
 }
}
