import java.util.*;
public class Main {
static int a[]=new int [1100];
  public static void main(String args[])
  {
	  Scanner input=new Scanner(System.in);
	  int n,m;
	  n=input.nextInt();m=input.nextInt();
	  int sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  a[i]=input.nextInt();sum+=a[i];}
	  int limt=sum/(4*m);
	  if(sum%(4*m)>0)limt++;
	  int cnt=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(a[i]>=limt)cnt++;
	 }
	  if(cnt>=m)System.out.println("Yes");
	  else
		  System.out.println("No");
  }
}