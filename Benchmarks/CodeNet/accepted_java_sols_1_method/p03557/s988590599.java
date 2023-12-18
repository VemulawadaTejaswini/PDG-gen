import java.util.*;

class Main{            
     
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);  

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int i = 0;        
        int j = 0;
        int k = 0;
        
        long ans = 0;
        long[] kek = new long[n];
        
        while (j < n) {
            while (k < n && c[k] <= b[j]) {
                k++;
            }
            kek[j] = n - k;
            j++;
        }

        for (int l = n - 2; l >= 0 ; l--) {
            kek[l] += kek[l + 1];
        }

        j = 0;
        
        while (i < n) {
            while (j < n && b[j] <= a[i]) {
                j++;
            }
            if (j < n)
            ans += kek[j];
            i++;
        }
        
        System.out.println(ans);       
                            
   }       
   

   
}