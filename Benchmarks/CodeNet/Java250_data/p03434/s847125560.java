import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        
        int Alice = 0;
        int Bob = 0;
        
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int i = 0; i < N; i++){
            if((i % 2) == 0 ){
                Alice += a[i];
            }else{
                Bob += a[i];
            }
        }
        
        System.out.println(Alice - Bob);
    }
    
}
