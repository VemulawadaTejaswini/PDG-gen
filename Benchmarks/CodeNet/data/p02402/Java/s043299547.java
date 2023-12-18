import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int t=sc.nextInt();
int max = t;
int min = t;
int sum = t;
for(int i=1;i<n;i++)
{
t=sc.nextInt();
if(t > max) max = t ;
if(t < min)min = t ;
sum = sum+=t;
}
System.out.println(min+" "+max+" "+sum);
}
}

