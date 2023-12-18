import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int N=in.nextInt();
String dummy = in.nextLine();
String S=in.nextLine();
int x=0; int max=0;
for (int i=0; i<N; i++)
{
char c=S.charAt(i);
if(c=='I')
x++;
else
x--;
if(x>max)
max=x;
}
System.out.println(max);
}
}
