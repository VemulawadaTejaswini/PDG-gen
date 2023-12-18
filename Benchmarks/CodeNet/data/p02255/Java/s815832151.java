import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int N=Integer.parseInt(br.readLine());
    Scanner scan=new Scanner(System.in);
    int[] array=new int[N];
    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    for(int i=1;i<array.length;i++){
      for(int k=0;k<array.length;k++){
        System.out.print(array[k]);
      }
      System.out.println();
      int v=array[i];
      int j=i-1;
      while(j>=0 && array[j]>v){
        array[j+1]=array[j];
        j--;
        array[j+1]=v;
        
      }
    }
  }
}
