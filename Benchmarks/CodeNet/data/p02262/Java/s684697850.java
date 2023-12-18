import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static int n=sc.nextInt();
    private static int[] a=new int[n];
    private static int cnt=0;
    public static void main(String[] args){
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] gd=new int[100];
        gd[0]=1;
        int j=0;
        do{
            gd[j+1]=3*gd[j]+1;
            j++;
        }while(gd[j]<n);
        int m=j;
        int[] g=new int[j];
        for(int i=0;i<=m-1;i++) g[m-1-i]=gd[i];
        for(int i=0;i<=m-1;i++) insertionSort(g[i]);
        System.out.println(m);
        for(int i=0;i<m-1;i++) System.out.print(g[i]+" ");
        System.out.println(g[m-1]);
        System.out.println(cnt);
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
private static void insertionSort(int g){
        for(int i=g;i<=n-1;i++){
            int v=a[i];
            int j=i-g;
            while(j>=0&&a[j]>v){
                a[j+g]=a[j];
                j=j-g;
                cnt++;
            }
            a[j+g]=v;
        }
    }
}