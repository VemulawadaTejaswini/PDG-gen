import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int s[]=new int[4];
for(int i=0;i<4;i++)
{
int t=scan.nextInt();
int n=scan.nextInt();
if(t==1)s[i]+=6000*n;
if(t==2)s[i]+=4000*n;
if(t==3)s[i]+=3000*n;
if(t==4)s[i]+=2000*n;
}
for(int i=0;i<4;i++)
{
System.out.println(s[i]);
}
}
}