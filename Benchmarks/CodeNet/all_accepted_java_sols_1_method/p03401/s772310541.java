import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int s[]=new int[n+2];
  s[0]=0;
  s[n+1]=0;
  int ss=0;
  for(int i=0;i<n;i++){
    s[i+1]=sc.nextInt();
    
  }
  for(int i=0;i<n+1;i++)ss+=Math.abs(s[i]-s[i+1]);
  for(int i=1;i<n+1;i++){
  System.out.println(ss+Math.abs(s[i-1]-s[i+1])-(Math.abs(s[i-1]-s[i])+Math.abs(s[i+1]-s[i])));
  }
  

}
}