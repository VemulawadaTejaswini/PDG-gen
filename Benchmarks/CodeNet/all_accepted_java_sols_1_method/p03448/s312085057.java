import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=0; i<=A; i++){
            for(int j=0; j<=B; j++){
                for(int z=0; z<=C; z++){
                    if((i*500) + (j*100) + (z*50) == X){
                        ans++;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}