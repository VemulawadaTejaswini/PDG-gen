import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] S=new int[n+1];
    for(int i=0;i<S.length-1;i++){
      S[i]=Integer.parseInt(scan.next());
    }
    int q=Integer.parseInt(scan.next());
    int[] T=new int[q];
    for(int i=0;i<T.length;i++){
      T[i]=Integer.parseInt(scan.next());
    }

    int count=0;
    for(int i=0;i<T.length;i++){
      int j=0;
      S[n]=T[i];
      while(S[j]!=T[i]){
        j++;
      }
      if(j==n){
        continue;
      }
      count++;
    }
    System.out.println(count);
  }
}

