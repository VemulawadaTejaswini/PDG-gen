import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long ar[]=new long[n];
        for (int i = 0; i < n; i++) {
            ar[i]=in.nextLong();
        }
        long sum=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n; j++) {
                sum=sum+(ar[i]*ar[j]);
            }
        }
        System.out.println(sum%(1000000000+7));
    }
}