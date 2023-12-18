import java.util.Scanner;
public class Main {
public static void main(String args[]) {
Scanner cro=new Scanner(System.in);
int i,j;
long sum;
int n=cro.nextInt();
int a[][]=new int[n-1][3];
for(i=0;i<n-1;i++)
{
a[i][0]=cro.nextInt();
a[i][1]=cro.nextInt();
a[i][2]=cro.nextInt();
}
for(j=0;j<n-1;j++)
{
sum=a[j][0]+a[j][1];
for(i=j+1;i<n-1;i++)
{
if(a[i][1]>sum)
{
sum=a[i][1];
}
if(sum%a[i][2]!=0)
{
sum=sum+(a[i][2]-sum%a[i][2]);
}
sum=sum+a[i][0];
}
System.out.println(sum);
}
System.out.println(0);
}
}
