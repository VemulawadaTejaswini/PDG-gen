import java.util.*;
public class Main{
 	public static void main(String args[]){
     	Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
     int ar[]=new int[a+2];
      for(int i=0;i<b;i++){
       	int l=sc.nextInt();
        int r=sc.nextInt();
        ar[l]++;
        ar[r+1]--;
      }
      int cnt=0;
      for(int i=1;i<=a;i++){
       	ar[i]+=ar[i-1];
        if(ar[i]==b)
          cnt++;
      }
      System.out.println(cnt);
    }
}