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
      System.out.println(array[0]+" "+array[0]+" "+array[0]);
    }else{
      int min=array[0];
      for(int i=0;i<array.length-1;i++){
        min=Math.min(min,array[i+1]);
      }
      int max=array[0];
      for(int i=0;i<array.length-1;i++){
        max=Math.max(max,array[i+1]);
      }
      long sum=0;
      for(int i=0;i<array.length;i++){
        sum+=array[i];
      }
      System.out.println(min+" "+max+" "+sum);
    }
  }
}
