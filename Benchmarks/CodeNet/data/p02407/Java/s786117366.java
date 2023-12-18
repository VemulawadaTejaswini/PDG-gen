import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int j=0;j<n/2;j++){
            int sub;
            sub=a[j];
            a[j]=a[n-j-1];
            a[n-j-1]=sub;
        }
        for(int k=0;k<n;k++){
            if(k<n-1){
           System.out.print(a[k]+" ");
           }
            if(k==n-1){
                System.out.println(a[k]);
            }
        }
        sc.close();
    }
}
