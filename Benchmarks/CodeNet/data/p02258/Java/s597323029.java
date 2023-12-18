import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        sc.close();
        System.out.println(max(a));
    }

    private static int max(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0,l = a.length;i < l;i++){
            for(int j = i + 1;j < l;j++){
                int s = a[j] - a[i];
                if(max < s) max = s;
            }
        }
        return max;
    }

}