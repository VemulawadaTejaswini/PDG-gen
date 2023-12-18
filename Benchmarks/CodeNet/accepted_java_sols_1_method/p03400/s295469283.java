import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=0; i<N; i++){
            int A = Integer.parseInt(sc.next());
            int day = 1;
            
            do{
                ans++;
                day += A;
            }while(day <= D);
        }
        
        System.out.println(ans + X);
    }
}