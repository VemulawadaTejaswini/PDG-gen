import java.lang.Math;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X  = new int[n];
        int sum = 0;
        for(int i=0 ; i<n;i++){
            X[i] = sc.nextInt();
            sum = sum + X[i];
        }
        int p = sum / n;
        int s1=0,s2=0;
        for(int i= 0;i<n;i++){
            s1 = s1 + (X[i]-p)*(X[i]-p);
            s2 = s2 + (X[i]-p-1)*(X[i]-p-1);
        }
        System.out.print(Math.min(s1,s2));
    }
}