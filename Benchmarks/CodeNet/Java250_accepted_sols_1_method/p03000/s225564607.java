import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] l=new int[n];
    for(int i=0;i<n;i++)
      l[i]=sc.nextInt();
    int point=0,cnt=1;
    
    for(int i=0;i<n;i++){
      point+=l[i];
      if(point<=x)
      	cnt++;
      else
        break;
    }
    System.out.println(cnt);
  }
}
