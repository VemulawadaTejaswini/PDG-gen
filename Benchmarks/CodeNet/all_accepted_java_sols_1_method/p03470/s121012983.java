import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        
        for(int i = 0; i < N ; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a, Collections.reverseOrder());
        
        int result = 0;
        int box = 0;
        
        for(int i = 0; i < N ; i++){
            if(i == 0){
                box = a[i];
                result++;
            }else{
                
                if(box > a[i]){
                    result++;
                    box = a[i];
                }else{
                    box = a[i];
                }
            }
        }
        System.out.println(result);
    }
    
}
