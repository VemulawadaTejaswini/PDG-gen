import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[210];
        int count = 0;
        
        boolean flg = false;
        
        
        for(int i = 0 ; sc.hasNext() ; i++){
            a[i] = sc.nextLong();
        }
        
        
        while(true){
            for(int i = 0; i <= (N - 1) ; i++){
                if(a[i] % 2 != 0){
                    flg = true;
                }else{
                    a[i] = a[i] / 2;
                }
            }
            if(flg){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
