import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count =0;
        while(test(a)){
            for(int i =0;i<a.length;i++){
                a[i] /= 2;
            }
            count ++;
        }
        System.out.println(count);
    }
    public static boolean test(int[] a){
        for(int i =0;i<a.length;i++){
            if(a[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}