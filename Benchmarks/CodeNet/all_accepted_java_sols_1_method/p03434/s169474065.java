import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Integer[] a = new Integer[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int alice = 0;
        int bob = 0;
        
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                alice+=a[i];
            }else{
                bob+=a[i];
            }
        }
        
        System.out.println(Math.abs(alice-bob));
    }
}
