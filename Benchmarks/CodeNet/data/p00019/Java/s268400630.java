import java.util.Scanner;
public class Main {
public static void main(String[] a) {
Scanner s=new Scanner(System.in);
int n=s.nextInt(),i=1,f=1;
for(;i<=n;i++)
f=f*i;
System.out.println(f);
}
}