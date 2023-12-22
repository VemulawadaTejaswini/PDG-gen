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
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int minj = i;
            for (int j = i; j < n; j++){
                if (a[j]<a[minj]){
                    minj = j;
                }
            }
            if (i!=minj){
                int temp = a[i];
                a[i] = a[minj];
                a[minj] = temp;
                cnt++;
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