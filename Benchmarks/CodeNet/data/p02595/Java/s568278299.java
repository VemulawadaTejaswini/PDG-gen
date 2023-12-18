
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
long n=ob.nextInt();
double d=ob.nextDouble();
int k=0;
for(int t=1;t<=n;t++)
{
long  x=ob.nextLong();
long y=ob.nextLong();
double ans=Math.sqrt((((x)*(x))*(1.0))+(((y)*(y))*(1.0)));

if(ans<=d){k++;}
}
        System.out.println(k);
       /* int n=ob.nextInt();
        if (n>=30) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        } */
    }

}
