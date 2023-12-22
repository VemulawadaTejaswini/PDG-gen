import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);
        for(int i =0;i<n;i++){
            if(a[n-1]==b[i]){
                System.out.println(a[n-2]);
            } else {
                System.out.println(a[n-1]);
            }
        }
    }
}