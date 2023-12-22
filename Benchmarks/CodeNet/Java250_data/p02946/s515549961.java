import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int x=sc.nextInt();
if(k==1)
System.out.println(x);
else
{
int s=x-k+1;
int e=x+k-1;
for(int i=s;i<=e;i++)
System.out.print(i+" ");
}
}

}