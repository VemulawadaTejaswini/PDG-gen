
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int max1,max2;
        if(a[0]<=a[1]){
            max1 = 1;
            max2 = 0;
        }else{
            max1 = 0;
            max2 = 1;
        }
        for(int i=2;i<n;i++){
            if(a[max1] <= a[i]){
                max2 = max1;
                max1 = i;
            }else if(a[max2] <=a[i]){
                max2 = i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==max1){
                System.out.println(a[max2]);
            }else{
                System.out.println(a[max1]);
            }

        }
    }

}