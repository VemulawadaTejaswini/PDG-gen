import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int po[]=new int[n];
  for(int i=0;i<n;i++)po[i]=sc.nextInt();
  boolean b=true;
  Arrays.sort(po);
  if(n%2==0){
  	for(int i=0;i<n;i++){
      if(i%2==0)po[i]--;
    	if(i!=po[i])b=false;
    }
  }
  else {
  	for(int i=0;i<n;i++){
    	if(i%2==1)po[i]--;
      if(i!=po[i])b=false;
    }
  }
  if(b){
    int ans=1;
  	for(int i=0;i<n/2;i++){
    	ans*=2;
      ans%=1000000007;
    }
    System.out.println(ans);
  }
  else System.out.println(0);
}
}
