import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        print(a);
        for(int i=1;i<n;i++){
            int t=a[i];
            int j=i-1;
            while(j>=0&&a[j]>t){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
            print(a);
        }
    }
    private static void print(int[] a){
        for(int i=0;i<=a.length-2;i++) System.out.print(a[i]+" ");
        System.out.println(a[a.length-1]);
    }
}