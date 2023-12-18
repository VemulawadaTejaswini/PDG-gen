import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        int count = 0;
        
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        //System.out.println();
        for(int i = 0; i < N; i++){
            //System.out.println(a[i]);
            x -= a[i];
            count++;
            if(x < 0){
                count--;
                break; 
            }
        }
        if(x > 0){
        System.out.println(count-1);
        }else{
            System.out.println(count);
        }
    }
}
