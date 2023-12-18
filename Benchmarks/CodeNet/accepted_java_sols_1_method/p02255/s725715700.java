import java.util.Scanner;

public class Main
{

 public static void main(String args[])
 {
  int N=0;
  Scanner s = new Scanner(System.in);
  N = s.nextInt();
  int[] number = new int[N];
  Scanner sc = new Scanner(System.in);
  for(int i=0;i<N;i++)
  {
   number[i]=s.nextInt();
  }
  sc.close();
  for(int k=0;k<N;k++)
  {
	  System.out.print(number[k]);
	  if(k!=N-1)System.out.print(" ");
  }
  System.out.print("\n");
  for(int i=1;i<N;i++)
  {
   int t=number[i];
   int j=0;
   for(j=i-1;j>=0;j--)
   {
    number[j+1]=number[j];
    if(t>number[j])break;
   }
   number[j+1]=t;
   for(int k=0;k<N;k++)
   {
 	  System.out.print(number[k]);
 	  if(k!=N-1)System.out.print(" ");
   }
   System.out.print("\n");
  }
 }
}
