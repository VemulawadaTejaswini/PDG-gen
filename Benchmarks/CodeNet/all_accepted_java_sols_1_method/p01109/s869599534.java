import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.lang.*;

public class Main{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n;
   List<Integer> lst=new ArrayList<Integer>();
   while(true){
    n =sc.nextInt();
    if(n==0){
     break;
    }
    int[] a=new int[n];
    int sum = 0;
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       sum += a[i];
    }
    sum /= n;
    int count = 0;
    for(int i=0;i<n;i++){
      if(a[i]<=sum){
         count++;
      } 
    }
    lst.add(count);

   }
   for(int j=0;j<lst.size();j++){
    System.out.println((int)lst.get(j));
   }
 }

}

