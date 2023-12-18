import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int kaisuu = 0;
        for(int i = 0; i < n; i++){
            kaisuu += narabekae(i,a);
        }
        
        for(int i = 0; i < n; i++){
            if(i != n-1){
                System.out.print(a[i]+" ");
            }else{
                System.out.println(a[i]);
            }
        }
        System.out.println(kaisuu);
    }
    
    private static int narabekae(int i, int a[]){
        int kaisuu = 0;
        for(int x = i; x > 0; x--){
            if(a[x-1] > a[x]){
                int a0;
                a0 = a[x-1];
                a[x-1] = a[x];
                a[x] = a0;
                kaisuu += 1;
            }
        }
    	return kaisuu;
    }
}
