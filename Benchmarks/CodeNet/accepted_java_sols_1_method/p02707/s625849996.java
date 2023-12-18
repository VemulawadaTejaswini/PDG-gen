import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int n =sc.nextInt();
int a[]=new int[n];
int ans[]=new int[200000];
for(int i=1;i<n;i++)
a[i]=sc.nextInt();
for(int i=1;i<n;i++)
ans[a[i]]++;
for(int i=1;i<n;i++)
System.out.println(ans[i]);
System.out.println(0);



}
}