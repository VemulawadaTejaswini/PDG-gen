import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int[] a = new int[n+1];
        for(int i=0; i<n+1; i++){
            a[i] = stdIn.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = stdIn.nextInt();
        }

        long cnt = 0;
        for(int i=0; i<n; i++){
            if(a[i] >= b[i]){
                cnt += b[i];
                b[i] = 0;
            }else{
                cnt += a[i];
                b[i] -= a[i];

                if(a[i+1] >= b[i]){
                    cnt += b[i];
                    a[i+1] -= b[i];
                }else{
                    cnt += a[i+1];
                    a[i+1] = 0;
                }
            }
        }

        System.out.println(cnt);
    }
}
