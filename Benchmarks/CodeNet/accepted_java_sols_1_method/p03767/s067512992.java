import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[3*n];
        for(int i =0;i<3*n;i++){
            a[i]=Integer.parseInt(sc.next());
        }
        long ans = 0;
        Arrays.sort(a);
        for(int i =n;i<3*n;i+=2){
            ans += a[i];
        }
        System.out.println(ans);
    }
}