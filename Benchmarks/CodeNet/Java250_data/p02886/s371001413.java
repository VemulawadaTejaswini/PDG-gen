import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] taste = new int[n];
        
        for(int i = 0; i < n;i++){
            taste[i] = Integer.parseInt(sc.next());
        }
        
        int sum=0;
        
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n;j++){
                sum+=taste[i]*taste[j];
            }
        }
        System.out.println(sum);
    }
}