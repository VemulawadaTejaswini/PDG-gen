import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j=0; j<a.length-1; j++) {
            for (int k=j+1; k<a.length; k++) {
                if(j != k){
                    sum += a[j]*a[k]%(10^9 + 7);
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}