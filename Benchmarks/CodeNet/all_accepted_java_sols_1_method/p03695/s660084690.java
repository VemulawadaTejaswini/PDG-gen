import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //String str = sc.next();
        int[] a = new int[N];
        int[] count = new int[9];
        int ans1 = 0;
        int ans2 = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(1 <= a[i] && a[i] <= 399){
                count[0] = 1;
            }else if(400 <= a[i] && a[i] <= 799){
                count[1] = 1;
            }else if(800 <= a[i] && a[i] <= 1199){
                count[2] = 1;
            }else if(1200 <= a[i] && a[i] <= 1599){
                count[3] = 1;
            }else if(1600 <= a[i] && a[i] <= 1999){
                count[4] = 1;
            }else if(2000 <= a[i] && a[i] <= 2399){
                count[5] = 1;
            }else if(2400 <= a[i] && a[i] <= 2799){
                count[6] = 1;
            }else if(2800 <= a[i] && a[i] <= 3199){
                count[7] = 1;
            }else{
                count[8]++;
            }
        }
        for(int i=0; i<8; i++){
            ans1 += count[i];
        }
        ans2 = ans1 + count[8];
        if(ans1 == 0){
            ans1 = 1;
        }
        System.out.println(ans1+" "+ans2);
    }
}