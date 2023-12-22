import java.util.*;
public class Main{
public static void main(String []args){
Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int m=s.nextInt();
  int ans=10000;
  for(int i=0;i<n;i++){
  	int k=s.nextInt();
    int b=s.nextInt();
    if(b<=m&&k<ans){
    	ans=k;
    }
  }
  if(ans==10000){System.out.println("TLE");}
  
  else System.out.println(ans);
}
}