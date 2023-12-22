import java.util.Scanner;

class Main
{
 public static void main(String x[])
 {
  Scanner sc= new Scanner(System.in);
  int a[]= new int[3];
  for(int i=0;i<3;i++)
    a[i]=sc.nextInt();
  int sum=a[0]+a[1]+a[2];
  if(sum<22)
    System.out.println("win");
  else
    System.out.println("bust");
	}
}
 
