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

    Arrays.sort(array);

    for(int i=array.length-1;i>=0;i--){
      System.out.print(array[i]);
      if(i>0){
        System.out.print(" ");
      }else{
        System.out.println();
      }
    }
  }
  static void show(int[] a){
    for(int k=0;k<a.length;k++){
      System.out.println(a[k]);
    }
  }
}

