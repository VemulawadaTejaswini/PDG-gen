import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[200010];

        int[] arr=new int[200010];
        for (int i = 2; i <=n; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=2;i<=n;i++)arr[a[i]]++;
        for (int i = 1; i <=n ; i++) {
            System.out.println(arr[i]);

        }








    }
}



