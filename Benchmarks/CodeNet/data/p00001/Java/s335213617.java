import java.util.Scanner;

public class AOJ0001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i = 0; i<10; i++)
            a[i] = s.nextInt();
        
        int max1 = a[0];
        int r1 = 0;
        int max2 = a[0];
        int r2 = 0;
        int max3 = a[0];
        int r3 = 0;
        
        for(int j = 1; j<10; j++){
            if(max1 < a[j]){
                max1 = a[j];
                r1 = j;
            }
        }
        
        a[r1] = 0;
        
        for(int k = 1; k<10; k++){
            if(max2 < a[k]){
                max2 = a[k];
                r2 = k;
            }
        }
        
        a[r2] = 0; 
        
        for(int l = 1; l<10; l++){
            if(max3 < a[l]){
                max3 = a[l];
                r3 = l;
            }
        }
        
        System.out.print(max1 + "\n" + max2 + "\n" + max3);
        
    }
}