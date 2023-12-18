import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[100000];
        for(int i=1;i<=100;++i) {
            for(int j=1;j<=100;++j) {
                for(int k=1;k<=100;++k) {
                    int t=i*i+j*j+k*k+i*j+j*k+k*i;
                    arr[t]++;
                }
            }
        }
        for(int i=1;i<=N;++i) {
            System.out.println(arr[i]);
        }
    }
}