import java.util.*;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[100_001];
        
        Arrays.fill(b,0);
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
        
        int max = 0;
        for(int i=1; i<100_000; i++){
            if(max<b[i-1]+b[i]+b[i+1]){
                max=b[i-1]+b[i]+b[i+1];
            }
        }
        System.out.println(max);
    }
}