import java.util.Scanner;
public class Main{
public static void main(String[] args) {
int[] X;
int n=0;
X=new int[10001];
Scanner sc = new Scanner(System.in);
for (int i = 1; ; i++) {
int x = sc.nextInt();
if(x==0)break;
System.out.println("Case "+i+": "+x);
}
}
}
