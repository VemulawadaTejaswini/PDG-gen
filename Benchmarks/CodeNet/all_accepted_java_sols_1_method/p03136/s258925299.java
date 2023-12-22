import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer max = 0, sum=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
            max = Math.max(a[i], max);
        }
        if(max < sum - max){
            System.out.println(new String("Yes"));
        }
        else{
            System.out.println(new String("No"));
        }
    }
}