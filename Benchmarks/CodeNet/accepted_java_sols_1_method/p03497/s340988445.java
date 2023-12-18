import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  int k=sc.nextInt();
  int []po=new int [n+1];
  for(int i=0;i<n;i++){
  po[sc.nextInt()]++;
  }
  Arrays.sort(po);
  int ans=0;
  for(int i=0;i<k;i++){
  	ans+=po[n-i];
  }
  System.out.println(n-ans);
}

}