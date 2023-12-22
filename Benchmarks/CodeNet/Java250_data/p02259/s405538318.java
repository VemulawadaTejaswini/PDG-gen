import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }

        // sort begin
        boolean flag = true;
        int cnt = 0;
        while (flag){
            flag = false;
            for (int j = n-1; j>0; j--){
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = true;
                    cnt++;
                }
            }
        }
        //sort end
        print(a);
        System.out.println(cnt);
    }

    public static void print(int[] a){
        System.out.print(a[0]);
        for (int i=1;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}