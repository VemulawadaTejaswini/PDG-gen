import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int b = sc.nextInt();
            int e = sc.nextInt();
            int tmp = 0;

            int l = 0;
            for(int j = b;j < b + ((e - b) / 2);j++){
                tmp = a[b + l];
                a[b + l] = a[(e - 1) - l];
                a[(e - 1) - l] = tmp;
                l++;
            }
        }

        for(int i = 0;i < n;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
