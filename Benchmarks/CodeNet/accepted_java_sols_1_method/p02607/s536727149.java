import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int [N+1];
        int count = 0;
        
        for(int i=1; i<N+1; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=1; i<N+1; i++){
            if(i%2 == 1 && a[i]%2 == 1){
                count++;
            }
        }
        
        System.out.println(count);
    }
}