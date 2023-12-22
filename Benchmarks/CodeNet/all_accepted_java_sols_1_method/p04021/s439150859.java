import java.util.*;
public class Main
{
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
for(int j=0;j<n;j++)
{
    t.put(ar[j],j);
}
int gh[]=new int[n];int kf=0;
for(Map.Entry<Integer,Integer> e:t.entrySet())
{
    gh[kf++]=e.getValue();
}
int nas=0;
for(int yy=0;yy<n;yy++)
{
    if(gh[yy]%2!=0)
    {
        if(yy%2==0)nas++;
    }
    if(gh[yy]%2==0)
    {
        if(yy%2!=0)nas++;
    }
}
System.out.println(nas/2);}}