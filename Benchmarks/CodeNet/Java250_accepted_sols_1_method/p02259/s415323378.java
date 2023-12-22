import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] array=new int[n];
    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    int count=0;
    for(int i=0;i<array.length-1;i++){
      for(int j=array.length-1;j>i;j--){
        if(array[j]<array[j-1]){
          int tmp=array[j-1];
          array[j-1]=array[j];
          array[j]=tmp;
          count++;
        }
      }
    }

    for(int i=0;i<array.length;i++){
      if(i<array.length-1){
        System.out.print(array[i]);
        System.out.print(" ");
      }else{
        System.out.println(array[i]);
      }
    }
    System.out.println(count);
  }
}
