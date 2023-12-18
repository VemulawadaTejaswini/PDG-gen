import java.util.*;

public class Main{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 0;
        int mid = 0;
        int max = 0;
        int x = 0;

        if(a > b){
            min = b;
            max = a;
        }else if(a <= b){
            min = a;
            max = b;
        }

        if(c > max){
            mid = max;
            max = c;
        }else if(c <= max){
            mid = c;
        }

        if(min > mid){
            x = mid;
            mid = min;
            min = x;
        }
        System.out.println(min + " " + mid + " " + max);
        sc.close();
    }
}
