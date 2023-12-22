import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        
        double tmp = (double)sum/n;
        
        double[] distance = new double[n];
        
        for(int i = 0; i < n; i++){
            distance[i] = Math.abs(a[i] - tmp);
        }
        
        double min = Double.MAX_VALUE;
        int index = 0;
        
        for(int i = 0; i < n; i++){
            if(distance[i] < min){
                min = distance[i];
                index = i;
            }
        }
        
        System.out.println(index);
        
    }
}
