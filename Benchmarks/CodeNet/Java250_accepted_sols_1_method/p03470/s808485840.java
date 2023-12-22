import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int count = 1;
        for(int i = 0; i < n-1; i++){
            if(d[i] < d[i+1]){
                count++;
            }
        }
        System.out.print(count);
    }
}