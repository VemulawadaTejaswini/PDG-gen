import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int []a = new int [n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      int sum =0;
      int q = sc.nextInt();
      int [][]b = new int [q][2];
      for(int i=0;i<q;i++){
        b[i][0]= sc.nextInt();
        b[i][1]= sc.nextInt(); 
      }
      for(int i=0;i<q;i++){
        sum = 0;
        int x = b[i][0];
        int y = b[i][1];
        for(int j=0;j<n;j++){
          if(a[j]==x){
            a[j] = y;
          }
          sum += a[j];
         }
        System.out.println(sum);
      }
    }
}