import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
long n=sc.nextInt();
long t=sc.nextInt();
long max = t;
long min = t;
long sum = t;
for(long i=1;i<n;i++)
{
t=sc.nextInt();
if(t > max) max = t ;
if(t < min)min = t ;
sum = sum+=t;
}
System.out.println(min+" "+max+" "+sum);
}
}

