import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m[]=new int[n];
for(int i=0;i<n;i++)
m[i]=sc.nextInt();
for(int i=n-1;i>=0;i-=2)System.out.print(m[i]+" ");
for(int i=n%2;i<n;i+=2)System.out.print(m[i]+" ");
}
}