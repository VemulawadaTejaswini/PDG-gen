import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for(int i = 0; i < count ; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        int sum = 0;
        for(int i = 0; i < count; i++ ){
            if(a[i]>=max)
                max = a[i];
            if(a[i]<=min)
                min = a[i];
            sum += a[i];
        }
        System.out.println(min+" "+max+" "+sum);
    }
}