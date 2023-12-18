import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int max2 = 0;
        int b = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(a[i]<=max/2){
                b = a[i];
            }
            else{
                b = max - a[i];
            }
            max2 = Math.max(max2, b);
            if(max2==b){
                ans = a[i];
            }
        }
        System.out.println(max + " " + ans);
    }
}