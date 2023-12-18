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
            int m = sc.nextInt();
            int e = sc.nextInt();
            int[] tmp = a.clone();

            for(int k = 0;k < e - b;k++){
                a[b + ((k + (e - m)) % (e - b))] = tmp[b + k];
            }
        }

        for(int i = 0;i < n;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
