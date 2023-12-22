import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
long d=sc.nextLong();
int cnt=0;

//long x[],y[]; x=new long[n]; y=new long[n];
long[] x=new long[(int)n];
long[] y=new long[(int)n];
int i=0;

while((n--)>0){
x[i]=sc.nextLong();
y[i]=sc.nextLong();
if(d*d>=(x[i]*x[i]+y[i]*y[i]))
cnt++;
i++;
}
System.out.println(cnt);
}


}