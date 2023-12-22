import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i, j, t;
        int cnt = 0;
        int n = sc.nextInt();
        int[] num;
        num = new int[n];
        for(i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(i=0; i<n; i++){
            for(j=n-1; j>i; j--){
                if(num[j-1] > num[j]){
                    t = num[j]; num[j] = num[j-1]; num[j-1] = t;
                    cnt++;
                }
            }
        }

        for(i=0; i<n-1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(num[n-1]);
        System.out.println(cnt);
        sc.close();
    }
}
