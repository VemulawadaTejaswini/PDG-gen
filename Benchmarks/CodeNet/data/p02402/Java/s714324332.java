import java.io.*;
import java.lang.Math;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());

    Scanner scan=new Scanner(System.in);
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=Integer.parseInt(scan.next());
    }

    Arrays.sort(a);

    int sum=0;
    System.out.print(a[0]+" ");
    System.out.print(a[n-1]+" ");
    for(int i=0;i<a.length;i++){
      sum+=a[i];
      if(i==a.length-1){
        System.out.println(sum);
      }
    }
  }
}
