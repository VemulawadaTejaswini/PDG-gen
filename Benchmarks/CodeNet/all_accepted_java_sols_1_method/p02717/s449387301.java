import java.util.Scanner;
class Main{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int[] a=new int[3];
  a[0]=sc.nextInt();
  a[1]=sc.nextInt();
  a[2]=sc.nextInt();
  //swpaing
  int temp;
  temp=a[0];
  a[0]=a[1];
  a[1]=temp;
  int temp2;
  temp2=a[0];
  a[0]=a[2];
  a[2]=temp2;
  for(int i=0;i<a.length;i++)
  {
    System.out.print(a[i]+" ");
  }
}
}