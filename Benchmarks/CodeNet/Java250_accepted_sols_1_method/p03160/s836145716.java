import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;++i) {
            h[i]=sc.nextInt();
        }
        int min=0, min2=Math.abs(h[1]-h[0]);
        int min3=min2;
        for(int i=2;i<n;++i) {
            min3=Math.min(min+Math.abs(h[i]-h[i-2]),min2+Math.abs(h[i]-h[i-1]));
            min=min2;
            min2=min3;

        }
        System.out.println(min3);
    }
}