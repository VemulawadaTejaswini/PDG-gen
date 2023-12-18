import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]= new int[n+1];
        for (int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=k+1;i<=n;i++){
            if (a[i]>a[i-k]){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}