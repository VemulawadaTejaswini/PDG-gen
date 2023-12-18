import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] array=new int[n];
    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    if(n==1){
      System.out.print(array[0]+" "+array[0]+" "+array[0]);
    }else{
      int min=0;
      for(int i=0;i<array.length-1;i++){
        min=Math.min(array[i],array[i+1]);
      }
      int max=0;
      for(int i=0;i<array.length-1;i++){
        max=Math.max(array[i],array[i+1]);
      }
      int sum=0;
      for(int i=0;i<array.length;i++){
        sum+=array[i];
      }
      System.out.print(min+" "+max+" "+sum);
    }
  }
}
