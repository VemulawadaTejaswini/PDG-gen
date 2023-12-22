import java .util.*;
class Main 
{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
String ans ="No";
for(int i =0;i<=n; i+=4)
{
if((n-i)%7==0)
{
ans ="Yes";
}
}
System.out.println(ans);
}
}