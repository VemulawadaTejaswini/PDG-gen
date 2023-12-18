import java.io.*;
import java.util.Scanner;
public class Main{
  public static void main (String[ ] args)throws IOException {
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    while(true){
      String str = input.readLine();
      if(str.charAt(0)=='-'){
        break;
      }
      Scanner sc = new Scanner(System.in); 
      int m = sc.nextInt();
      int [] h;
      h = new int[10000];
      int q=1;
      int g=1;
      int i=0;
      int d,l,r;
      int n = str.length();
      char [] k;
      k = new char[10000];
      char [] k2;
      k2 = new char[10000];
      while(q<=m){
        h[q] = sc.nextInt();
        q++;
      }
      for(r=0;r<n;r++){
        k[r]=str.charAt(r);
      }
      while(g<=m){
        for(d=0;d<n;d++){
          k2[d]=k[d];
        }
        while(i<n){
          if(i<h[g]){
            k[i+n-h[g]]=k2[i];
          }
          if(i>=h[g]){
            k[i-h[g]]=k2[i];
          }
          i++;
        }
        i=0;
        g++;
      }
      for(l=0;l<n;l++){
        System.out.print(k[l]);
      }
      System.out.print("\n");
    }
  }
}