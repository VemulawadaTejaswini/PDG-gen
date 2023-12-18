import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N =sc.nextInt();
        int x =sc.nextInt();
        int a[] = new int[N];
        int count=0;
        int sw=0;
        
        
        
        for(int i=0;i<N;i++){
            a[i] =sc.nextInt();
        }
        
        Arrays.sort(a);
        
        for(int i=0;i<N;i++){
            if(a[i]<=x){
                x -= a[i];
                count++;
            }else{
                sw=1;
                break;
            }
        }
        if(x>0 && sw==0){
            count--;
        }
        System.out.println(count);
        
        
        
        
        
        
        
    }
}
