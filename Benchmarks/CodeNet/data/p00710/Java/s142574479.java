import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0&&r==0)break;
            int[] x = new int[n];
            for(int i=0;i<n;i++){
                x[i] = n-i;
            }
            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] a = new int[n];
                for(int j=0;j<c;j++) {
                    a[j] = x[p-1+j];
                }
                for(int j=0;j<p-1;j++){
                    x[p-2-j+c] = x[p-2-j];
                }
                for(int j=0;j<c;j++){
                    x[j] = a[j];
                }
            }
            System.out.println(x[0]);
        }
    }
}

