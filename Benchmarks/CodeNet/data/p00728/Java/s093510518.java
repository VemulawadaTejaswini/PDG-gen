//2007 Domestic A
import java.io.*;
import java.util.*;

class Main{
  public static Scanner cin;
  public static void judge(int n){
    int ma=0,mi=1000,s=0,x,i;
    for(i=0;i<n;i++){
      x=cin.nextInt();
	  if(x<mi)mi=x;
	  if(x>ma)ma=x;
      s+=x;
    }
	System.out.println((s-ma-mi)/(n-2));
  }
  public static void main(String args[]){
    cin=new Scanner(System.in);
	while(true){
	  int n=cin.nextInt();
	  if(n==0)break;
	  judge(n);
	}
  }
}